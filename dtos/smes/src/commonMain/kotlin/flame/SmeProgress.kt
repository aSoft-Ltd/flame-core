@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame

import flame.SmeDto
import kotlinx.JsExport

data class SmeProgress(
    val sme: SmeDto,
    val admin: SmeSectionProgress,
    val documents: SmeSectionProgress,
    val finance: SmeSectionProgress,
    val analysis: SmeSectionProgress,
    val funding: SmeSectionProgress,
    val governance: SmeSectionProgress,
    val swot: SmeSectionProgress,
    val business: SmeSectionProgress
) {
    val overall by lazy { admin + documents + finance + funding + governance }
}