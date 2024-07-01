@file:JsExport
package flame.analysis

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class FinancialReportsDto(
    val date: ReportDate,
    val sheet: BalanceSheetDto,
    val income: IncomeStatementDto,
    val cash: CashFlowDto,
)