@file:JsExport
package flame.finance

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeFinancialAcquisitionDto(
    val statements: String? = null,
    val dd: String? = null,
    val mou: String? = null,
)