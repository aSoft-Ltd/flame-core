@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame.funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeFundingDto(
    val investment: SmeInvestmentDto? = null,
    val breakdown: SmeBreakdownDto? = null,
    val acquisition: SmeAcquisitionDto? = null
)