@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame.admin

import kollections.List
import kollections.emptyList
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeAdminDto(
    val contacts: SmeContactsDto? = null,
    val business: SmeBusinessDto? = null,
    val legal: SmeLegalComplianceDto? = null,
    val directors: List<SmeDirectorDto> = emptyList(),
    val shareholders: List<SmeShareholderDto> = emptyList(),
)