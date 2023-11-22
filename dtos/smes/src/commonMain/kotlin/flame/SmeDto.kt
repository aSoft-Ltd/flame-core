@file:JsExport
package flame

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeDto(
    val uid: String,
    val admin: SmeAdminDto?
)