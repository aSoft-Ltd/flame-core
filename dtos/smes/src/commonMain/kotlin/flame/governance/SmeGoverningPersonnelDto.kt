@file:JsExport

package flame.governance

import cabinet.Attachment
import kotlinx.JsExport

data class SmeGoverningPersonnelDto(
    var name: String?,
    val role: String?,
    val qualification: String?,
    val experience: Int?,
    val resume: Attachment?
)