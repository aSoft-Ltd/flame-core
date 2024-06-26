@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame.governance

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeDirectorDto(
    val name: String? = null,
    val phone: String? = null,
    val email: String? = null,
)