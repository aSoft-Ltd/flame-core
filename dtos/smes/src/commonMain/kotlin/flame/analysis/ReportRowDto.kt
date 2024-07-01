@file:JsExport
package flame.analysis

import kollections.List
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class ReportRowDto(
    val label: String,
    val amount: Double,
    val rows: List<ReportRowDto>,
)