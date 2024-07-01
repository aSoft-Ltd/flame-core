@file:JsExport
package flame.analysis

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class IncomeStatementDto(
    val revenue: ReportRowDto,
    val cogs: ReportRowDto,
    val grossProfit: Double,
    val expenses: ReportRowDto,
    val taxes: ReportRowDto,
    val netProfit: Double,
)