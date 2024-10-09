package flame

import cabinet.AttachmentDto
import flame.admin.SmeAdminDto
import flame.admin.SmeBusinessDto
import flame.admin.SmeContactsDto
import flame.admin.SmeLegalComplianceDto
import flame.documents.SmeDocument
import flame.finance.SmeBackOfficeDto
import flame.finance.SmeFinanceDto
import flame.finance.SmeFinancialAcquisitionDto
import flame.finance.SmeFinancialStatusDto
import flame.funding.SmeAcquisitionDto
import flame.funding.SmeBreakdownDto
import flame.funding.SmeFundingDto
import flame.funding.SmeInvestmentDto
import flame.governance.SmeGovernanceDto
import flame.governance.SmeManPowerDto
import flame.governance.SmeManagementDto
import flame.plan.QnADto
import flame.plan.SmePlanDto
import flame.swot.SmeSwotDto
import kollections.*
import kotlin.collections.Collection


fun SmeDto.toProgress() = SmeProgress(
    sme = this,
    admin = admin.toProgress(),
    documents = documents.toProgress(),
    finance = finance.toProgress(),
    analysis = SmeSectionProgress(xlsx?.let {
        1
    }?:0, 1),
    funding = funding.toProgress(),
    governance = governance.toProgress(),
    swot = swot.toProgress(),
    business = business.toProgress()
)

fun SmePlanDto.toProgress():SmeSectionProgress {
    val total = kollections.listOf(
        this.marketing.toQNProgress("Marketing"),
        this.services.toQNProgress("Services"),
        this.industry.toQNProgress("Industry"),
        this.competition.toQNProgress("Competition"),
        this.customers.toQNProgress("Customers"),
        this.suppliers.toQNProgress("Suppliers"),
        this.legal.toQNProgress("Legal"),
        this.realEstate.toQNProgress("Real Estate"),
    ).aggregate()

    return total;
}

fun List<QnADto>.toQNProgress(label:String):SmeSectionProgress {

    val progress = SmeSectionProgress(
        completed = filter {
            it.answer != null
        }.size,
        total = size
    )

    return progress
}

internal fun Collection<AttachmentDto>.toProgress(): SmeSectionProgress {
    val total = SmeDocument.List.entries + SmeDocument.FinancialRecord.entries + SmeDocument.Additional.entries
    return SmeSectionProgress(size, total.size)
}


internal fun SmeManPowerDto?.toProgress() = kollections.listOf(
//    this?.insuranceScheme,
//    this?.noOfJobs,
    this?.skillShortfall,
    this?.labour,
    this?.unionised,
    this?.successPlan,
    this?.organogram,
    this?.disputes,
    this?.specialist,
).toProgressAny()

internal fun SmeGovernanceDto?.toProgress():SmeSectionProgress {
    val managementProgress = this?.management?.toProgress()
    val directorsProgress = this?.directors?.toProgressAny()
    val manPowerProgress = this?.manpower.toProgress()

    println("Directors Progress: ${directorsProgress?.info}")
    println("ManPower Progress: ${manPowerProgress?.info}")
    return kollections.listOf(
        this?.management?.toProgress() ?: SmeSectionProgress(0, 1),
        this?.directors?.toProgressAny() ?: SmeSectionProgress(0, 1),
        this?.manpower.toProgress()
    ).aggregate()
}

internal fun SmeManagementDto.toProgress():SmeSectionProgress {
    return kollections.listOf(
        this.team.toCompletedIfNotEmpty(),
        this.committee.toCompletedIfNotEmpty()
    ).aggregate()
}

internal fun SmeSwotDto?.toProgress(min: Int = 4) = if (this == null) SmeSectionProgress(0, min) else kollections.listOf(
    strengths.toCompletedIfNotEmpty(),
    weaknesses.toCompletedIfNotEmpty(),
    opportunities.toCompletedIfNotEmpty(),
    threats.toCompletedIfNotEmpty()
).aggregate()

private fun kollections.Collection<String>.toProgress(min: Int) = if (size >= min) {
    SmeSectionProgress(min, min)
} else {
    SmeSectionProgress(size, min)
}

internal fun SmeFinanceDto?.toProgress() = listOf(
    this?.office.toProgress(),
    this?.status.toProgress(),
//    this?.acquisition.toProgress()
).aggregate()

internal fun SmeBackOfficeDto?.toProgress() = listOf(
    this?.accounting,
    this?.payroll,
    this?.accountingConsultation,
    this?.noOfEmployeesInTheFinanceDepartment,
    this?.financialHead,
    this?.totalStaffCompliment,
    this?.hrConsultation,
    this?.policyExistence,
    this?.policyReviewFrequency,
    this?.assetsAssurance,
    this?.criticalSystems,
).toProgressAny()

fun SmeFinancialStatusDto?.toProgress() = listOf(
//    this?.latestFinancialStatements,
//    this?.managementAccounts,
    this?.financialsAuditedOrReviewed,
    this?.budgetForReview,
//    this?.debtorsAging,
//    this?.creditAging,
    this?.longTermContracts,
    this?.offBalanceSheetFunding,
    this?.assetRegister,
    this?.permissionsFromLender,
//    this?.guarantees,
).toProgressAny()


fun SmeAdminDto?.toProgress(): SmeSectionProgress = listOf(
    this?.contacts.toProgress(),
    this?.business.toProgress(),
    this?.legal.toProgress(),
    this?.shareholders.toCompletedIfNotEmpty(),
).aggregate()

fun SmeContactsDto?.toProgress() = listOf(
    this?.firstName,
    this?.lastName,
    this?.email,
    this?.phone,
    this?.role,
//    this?.dob,
).toProgressAny()

fun SmeBusinessDto?.toProgress() = listOf(
    this?.name,
    this?.registration,
    this?.phone,
    this?.yearsInOperation,
    this?.address,
//    this?.numberOfJobs,
    this?.industry,
    this?.businessStage,
    this?.bbbee,
    this?.staffComplement,
    this?.description
).toProgressAny()


fun SmeLegalComplianceDto?.toProgress() = listOf(
    this?.cipcAnnualReturns,
//    this?.registration,
    this?.vatRegistration,
    this?.vatNumber,
    this?.taxComplianceStatus,
    this?.incomeTaxNumber,
    this?.workmanCompensationOption,
    this?.workmanCompensationNumber,
).toProgressAny()

internal fun SmeFinancialAcquisitionDto?.toProgress() = listOf(
    this?.statements,
    this?.dd,
    this?.mou,
).toProgressAny()

fun SmeBreakdownDto?.toProgress() = listOf(
    this?.acquisition,
    this?.capex,
    this?.capital,
    this?.finance
).toProgressAny()

fun SmeInvestmentDto?.toProgress() = listOf(
    this?.amount,
    this?.type,
    this?.debtTenure,
    this?.equity,
    this?.description,
).toProgressAny()

fun SmeFundingDto?.toProgress() = listOf(
    this?.investment.toProgress(),
    this?.breakdown.toProgress(),
    this?.acquisition.toProgress()
).aggregate()

fun SmeAcquisitionDto?.toProgress() = listOf(this?.price, this?.dd, this?.valuation).toProgressAny()

internal fun List<Any?>?.toCompletedIfNotEmpty():SmeSectionProgress {
    return when (this?.isEmpty()) {
        true -> SmeSectionProgress(0, 1)
        null -> SmeSectionProgress(0, 1)
        false -> SmeSectionProgress(1, 1)
    }
}

internal fun List<Any?>.toProgressAny() = SmeSectionProgress(filterNotNull().size, size)

internal fun List<SmeSectionProgress>.aggregate() = reduce { acc, it -> acc + it }