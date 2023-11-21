package flame

import kotlinx.serialization.Serializable

@Serializable
data class SmeAdminDto(
    val contacts: SmeContactsDto
)