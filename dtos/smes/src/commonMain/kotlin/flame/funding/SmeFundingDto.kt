@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame.funding

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeFundingDto(
    val investment: SmeInvestmentDto? = null
)