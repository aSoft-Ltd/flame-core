@file:JsExport

package flame.governance

import kollections.List
import kollections.emptyList
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeGovernanceDto(
    val directors: List<SmeDirectorDto> = emptyList(),
    val management: List<SmeDirectorDto> = emptyList(),
    val advisory: List<SmeDirectorDto> = emptyList(),
    val manpower: SmeManPowerDto? = null
)