package flame

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