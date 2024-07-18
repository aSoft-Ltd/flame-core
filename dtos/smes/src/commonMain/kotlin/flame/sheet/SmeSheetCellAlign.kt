@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")
package flame.sheet

import cabinet.AttachmentDto
import flame.admin.SmeAdminDto
import flame.analysis.FinancialReportsDto
import flame.finance.SmeFinanceDto
import flame.funding.SmeFundingDto
import flame.governance.SmeGovernanceDto
import flame.plan.SmePlanDto
import flame.swot.SmeSwotDto
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
enum class SmeSheetCellAlign{
    left, right, center;

    val isLeft get() = this == left
    val isRight get() = this == right
    val isCenter get() = this == center
}