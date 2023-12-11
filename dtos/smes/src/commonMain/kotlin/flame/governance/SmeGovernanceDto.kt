@file:JsExport
package flame.governance

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeGovernanceDto(
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