@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame

import kollections.List
import kollections.iEmptyList
import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeAdminDto(
    val contacts: SmeContactsDto? = null,
    val business: SmeBusinessDto? = null,
    val legal: SmeLegalComplianceDto? = null,
    val directors: List<SmeDirectorDto> = iEmptyList(),
    val shareholders: List<SmeShareholderDto> = iEmptyList(),
)