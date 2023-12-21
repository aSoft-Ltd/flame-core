@file:JsExport
package flame.funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeBreakdownDto(
    val acquisition: Double? = null,
    val capex: Double? = null,
    val capital: Double? = null,
    val finance: Double? = null
)