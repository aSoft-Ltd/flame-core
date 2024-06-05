@file:JsExport

package flame.governance

import cabinet.Attachment
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeGoverningPersonnelDto(
    val name: String?,
    val role: String?,
    val qualification: String?,
    val experience: Double?,
    val resume: Attachment?
)