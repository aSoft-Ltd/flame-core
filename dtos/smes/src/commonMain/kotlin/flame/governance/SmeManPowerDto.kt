@file:JsExport
package flame.governance

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeManPowerDto(
    val insuranceScheme: String? = null,
    val noOfJobs: Int? = null,
    val skillShortfall: String? = null,
    val labour: String? = null,
    val unionised: String? = null,
    val successPlan: String? = null,
    val organogram: String? = null,
    val disputes: String? = null,
    val specialist: String? = null,
)