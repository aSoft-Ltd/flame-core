@file:JsExport
package flame.plan

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class QnADto(
    val question: String,
    var answer: String? = null
)