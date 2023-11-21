package flame

import kotlinx.serialization.Serializable

@Serializable
data class SmeDto(
    val uid: String,
    val admin: SmeAdminDto?
)