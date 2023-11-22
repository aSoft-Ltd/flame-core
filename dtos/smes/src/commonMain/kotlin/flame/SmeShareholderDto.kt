@file:JsExport

package flame

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeShareholderDto(
    val name: String? = null,
    val currentShareholding: Double? = null,
    val postInvestmentShareholding: Double? = null,
    val isJuristic: Boolean? = null,
    val beneficiary: String? = null
)