@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")
package flame.sheet

import kollections.List
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeSheetRow(
    val cells: List<SmeSheetCell>
)