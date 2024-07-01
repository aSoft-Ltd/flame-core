@file:JsExport
package flame.analysis

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class CashFlowDto(
    val operating: ReportRowDto,
    val investment: ReportRowDto,
    val financing: ReportRowDto,
)