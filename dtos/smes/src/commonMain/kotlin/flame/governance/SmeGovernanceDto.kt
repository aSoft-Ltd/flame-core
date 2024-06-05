@file:JsExport

package flame.governance

import kollections.List
import kollections.emptyList
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeGovernanceDto(
    val directors: List<SmeGoverningPersonnelDto> = emptyList(),
    val management: SmeManagementDto? = SmeManagementDto(
        committee = emptyList(),
        team = emptyList()
    ),
    val advisory: List<SmeGoverningPersonnelDto> = emptyList(),
    val manpower: SmeManPowerDto? = null
)