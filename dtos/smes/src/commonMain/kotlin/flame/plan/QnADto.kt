package flame.plan

import kotlinx.serialization.Serializable

@Serializable
data class QnADto(
    val question: String,
    var answer: String? = null
)