@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame.funding

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeFundingDto(
    val investment: SmeInvestmentDto = SmeInvestmentDto(),
    val breakdown: SmeBreakdownDto = SmeBreakdownDto(),
    val acquisition: SmeAcquisitionDto = SmeAcquisitionDto()
)