@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeAdminDto(
    val contacts: SmeContactsDto?,
    val business: SmeBusinessDto?,
    val legal: SmeLegalComplianceDto?
)