package flame

import cabinet.AttachmentDto
import flame.admin.SmeAdminDto
import flame.analysis.FinancialReportsDto
import flame.finance.SmeFinanceDto
import flame.funding.SmeFundingDto
import flame.governance.SmeGovernanceDto
import flame.plan.SmePlanDto
import flame.sheet.SmeSheet
import flame.swot.SmeSwotDto
import kotlinx.serialization.Serializable

@Serializable
data class SmeDto(
    val uid: String,
    val origin: String = "unknown",
    val company: String = "",
    val admin: SmeAdminDto? = null,
    val funding: SmeFundingDto? = null,
    val finance: SmeFinanceDto? = null,
    val documents: List<AttachmentDto> = emptyList(),
    val xlsx: AttachmentDto? = null,
    val sheet: SmeSheet? = null,
    val governance: SmeGovernanceDto? = null,
    val business: SmePlanDto = SmePlanDto(),
    val swot: SmeSwotDto? = null,
    val reports: List<FinancialReportsDto> = emptyList()
)