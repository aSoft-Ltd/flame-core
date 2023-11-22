@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame

import kollections.List
import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeAdminDto(
    val contacts: SmeContactsDto?,
    val business: SmeBusinessDto?,
    val legal: SmeLegalComplianceDto?,
    val shareholders: List<SmeShareholderDto>,
)