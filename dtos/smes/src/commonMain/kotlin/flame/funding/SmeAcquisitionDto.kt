@file:JsExport
package flame.funding

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeAcquisitionDto(
    val price: Double? = null,
    val dd: Double? = null,
    val valuation: String? = null
)