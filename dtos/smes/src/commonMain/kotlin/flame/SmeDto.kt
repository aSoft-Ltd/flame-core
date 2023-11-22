@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeDto(
    val uid: String,
    val admin: SmeAdminDto?
)