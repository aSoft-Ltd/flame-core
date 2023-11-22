@file:JsExport
package flame.admin

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeLegalComplianceDto(
    val cipcAnnualReturns: String? = null,
    val registration: String? = null,
    val vatRegistration: String? = null,
    val vatNumber: String? = null,
    val taxComplianceStatus: String? = null,
    val incomeTaxNumber: Int? = null,
    val workmanCompensationOption: String? = null,
    val workmanCompensationNumber: Int? = null
)