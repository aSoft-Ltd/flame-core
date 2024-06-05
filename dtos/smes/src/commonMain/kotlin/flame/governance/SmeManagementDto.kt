@file:JsExport

package flame.governance

import kollections.List
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeManagementDto(
    val committee: List<SmeGoverningPersonnelDto>,
    val team: List<SmeGoverningPersonnelDto>,
)