@file:JsExport

package flame.finance

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeFinancialStatusDto(
    val latestFinancialStatements: String? = null,
    val managementAccounts: String? = null,
    val financialsAuditedOrReviewed: String? = null,
    val budgetForReview: String? = null,
    val debtorsAging: String? = null,
    val creditAging: String? = null,
    val longTermContracts: String? = null,
    val offBalanceSheetFunding: String? = null,
    val assetRegister: String? = null,
    val permissionsFromLender: String? = null,
    val guarantees: String? = null,
)