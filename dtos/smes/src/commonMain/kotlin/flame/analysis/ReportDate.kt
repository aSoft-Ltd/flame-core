@file:JsExport
package flame.analysis

import kotlinx.serialization.Serializable
import krono.LocalDate
import kotlin.js.JsExport

@Serializable
data class ReportDate(
    val start: LocalDate,
    val end: LocalDate
)