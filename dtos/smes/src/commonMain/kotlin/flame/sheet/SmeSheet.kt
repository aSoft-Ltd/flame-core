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
data class SmeSheet(
    val rows: List<SmeSheetRow>
)