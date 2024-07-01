@file:JsExport

package flame.analysis

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class BalanceSheetDto(
    val assets: ReportRowDto,
    val equity: ReportRowDto,
    val liabilities: ReportRowDto,
)