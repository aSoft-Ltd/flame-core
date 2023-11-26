@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame

import flame.admin.SmeAdminDto
import flame.finance.SmeFinanceDto
import flame.funding.SmeFundingDto
import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeDto(
    val uid: String,
    val company: String = "",
    val admin: SmeAdminDto? = null,
    val funding: SmeFundingDto? = null,
    val finance: SmeFinanceDto? = null
)