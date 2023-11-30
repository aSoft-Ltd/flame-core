@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame.finance

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeFinanceDto(
    val office: SmeBackOfficeDto = SmeBackOfficeDto()
)