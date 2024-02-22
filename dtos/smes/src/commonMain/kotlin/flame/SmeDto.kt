package flame

import cabinet.Attachment
import flame.admin.SmeAdminDto
import flame.finance.SmeFinanceDto
import flame.funding.SmeFundingDto
import flame.governance.SmeGovernanceDto
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
    val documents: List<Attachment> = emptyList(),
    val governance: SmeGovernanceDto? = null,
    val swot: SmeSwotDto? = null
)