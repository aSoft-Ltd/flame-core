@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame.admin

import kotlin.js.JsExport
import kotlinx.serialization.Serializable
import krono.LocalDate

@Serializable
data class SmeContactsDto(
    val firstName: String?,
    val lastName: String?,
    val email: String?,
    val phone: String?,
    val role: String?,
    val dob: LocalDate?,
)