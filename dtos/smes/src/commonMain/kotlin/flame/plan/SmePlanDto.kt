package flame.plan

import kollections.List
import kollections.listOf
import kollections.map
import kotlinx.serialization.Serializable

@Serializable
data class SmePlanDto(
    val marketing: List<QnADto> = listOf(
        "How was the market research conducted? (Desktop, surveys, research firms, etc)",
        "Review industry information to assess the current and potential growth prospects of the market in which the client operates",
        "Assess the overall sales and marketing strategy. How realistic and achievable is it? Must be based on secured contracts, letters of intent and/or verifiable market research.",
        "Who is your target market, how big its, what is your current share and what is the target that you are after post investment?",
        "Are there any potential customers under negotiations i.e., any possible offtake agreements?",
        "Description of distribution channels used/to be used to reach the target market",
        "Does the entity have any marketing campaign? What are the metrics and milestones.",
        "Assess the reasonableness of the assumptions for the revenue projects",
    ).map { QnADto(it) },
    val services: List<QnADto> = listOf(),
    val industry: List<QnADto> = listOf(),
    val competition: List<QnADto> = listOf(),
    val customers: List<QnADto> = listOf(),
    val suppliers: List<QnADto> = listOf(),
    val legal: List<QnADto> = listOf(),
    val realEstate: List<QnADto> = listOf()
)