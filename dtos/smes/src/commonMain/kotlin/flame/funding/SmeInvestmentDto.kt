@file:JsExport
package flame.funding

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeInvestmentDto(
    val amount: Double? = null,
    val type: String? = null,
    val debtTenure: Double? = null,
    val equity: Double? = null,
    val description: String? = null
)