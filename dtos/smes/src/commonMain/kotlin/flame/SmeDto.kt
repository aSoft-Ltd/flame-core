package flame

import cabinet.Attachment
import flame.admin.SmeAdminDto
import flame.finance.SmeFinanceDto
import flame.funding.SmeFundingDto
import kotlinx.serialization.Serializable

@Serializable
data class SmeDto(
    val uid: String,
    val company: String = "",
    val admin: SmeAdminDto? = null,
    val funding: SmeFundingDto? = null,
    val finance: SmeFinanceDto? = null,
    val documents: List<Attachment> = emptyList()
)