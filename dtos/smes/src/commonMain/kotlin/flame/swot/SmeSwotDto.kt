package flame.swot

import kotlinx.serialization.Serializable

@Serializable
data class SmeSwotDto(
    val strengths: List<String> = emptyList(),
    val weaknesses: List<String> = emptyList(),
    val opportunities: List<String> = emptyList(),
    val threats: List<String> = emptyList(),
)