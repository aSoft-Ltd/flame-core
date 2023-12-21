@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame.finance

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeFinanceDto(
    val office: SmeBackOfficeDto? = null,
    val status: SmeFinancialStatusDto? = null,
    val acquisition: SmeFinancialAcquisitionDto? = null
)