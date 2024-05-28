@file:JsExport

package flame.plan

import kollections.List
import kollections.listOf
import kollections.map
import kotlinx.JsExport
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
    val services: List<QnADto> = listOf(
        "What is the product mix of the business?",
        "Please briefly describe your production process and provide process flow diagram or images if available. (please ensure a detailed description is included in the business plan)",
        "Why would customers be attracted to your products (what is your value proposition, quality, reliability, price, etc)? What gives your product the competitive edge over your rivals?",
        "Please provide details of tests, evaluations, studies, and surveys about products or services under development",
        "Are the goods and services meant to satisfy a need in the market or enhance an existing product/service?",
        "Briefly explain the entities pricing strategy and how effective is it?"
    ).map { QnADto(it) },
    val industry: List<QnADto> = listOf(
        "Describe the industry in terms of geographic location, product lines, channels of distribution, pricing policies, degree of integration and type of customers.",
        "What is the size of the market (rand value) and how much of that market size/share are you targeting?",
        "What are the most recent noticeable industry trends and how has the entity adapted to them?",
        "Are there any significant barriers to entry in the industry?",
        "What has been the general industry growth rates of sales and profits and what is the expected future growth rate? Is the business in line with industry norms?",
        "What are the threats to success in your industry and how you plan to overcome them?"
    ).map { QnADto(it) },
    val competition: List<QnADto> = listOf(
        "Who are your major competitors? Name How long have they been in business?",
        "What key success factors do the competitor demonstrate?",
        "What is the entities competitive edge over its competitors? Differentiating factor! What weakness have you identified in your competitors?",
        "What skills will be necessary in order to allow you to have the competitive advantage?",
        "Are there any substitute products available in the market?"
    ).map { QnADto(it) },
    val customers: List<QnADto> = listOf(
        "Who are your key customers and what are their terms?",
        "Please provide brief description of the company’s credit policies",
        "Are there any contracts/ orders/ letters of interest supporting the sales projections?",
        "Is there a customer retention strategy in place?",
        "Is there a dependence of a few customers and suppliers and how does this compare with competitors?",
    ).map { QnADto(it) },
    val suppliers: List<QnADto> = listOf(
        "Who are your key suppliers and what are their terms. (please attach contracts/SLAs)",
        "How often do suppliers implement price increases and do you have any buying power or control to influence that?",
        "Are there any materials contracts (individuals or firms) including supply agreements, guarantees, indemnities, distribution agreements, letters of comfort provided to third parties."
    ).map { QnADto(it) },
    val legal: List<QnADto> = listOf(
        "Has the entity protected its intellectual property if any? (trademarks, patents, copyrights)",
        "Are there any compliance matters with any authorities in place or envisaged to be in place in the near future that may have an impact on business operations? (tax, industry, environment etc..,)",
        "Please provide proof that all necessary regulatory approvals have been obtained or at least applied for i.e. Environmental, Impact Assessments (EIA), rezoning of property rights (if required), etc. If these are yet to be obtained, please provide indicative timing for obtaining of such approvals. (please attached copies if applicable)",
        "Are there any Judgements against the company/director(s)?",
        "Are there any pending legal disputes against/by the company/director(s)?",
        "Are there any patent and trademark disputes in progress?"
    ).map { QnADto(it) },
    val realEstate: List<QnADto> = listOf(
        "Please provide documents relating to property owned, leased by the company;",
        "Are there any material liens, restrictions, violations, covenants, servitudes and agreements of any significance affecting any property owned or leased by the company?",
        "Copies of all mortgages over the properties",
        "Establish duration of lease and any possible causes for termination",
        "Determine if there are any disputes in relation to the property or leases"
    ).map { QnADto(it) }
)