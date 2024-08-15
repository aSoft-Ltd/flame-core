@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame.documents

import kotlinx.JsExport
import epsilon.RawFile

data class SMEDocumentUploadParam(
    val path: String,
    val document: SmeDocument,
    val filename: String,
    val file: RawFile,
)