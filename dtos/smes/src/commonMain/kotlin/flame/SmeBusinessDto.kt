@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package flame

import geo.AddressDto
import identifier.Industry
import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeBusinessDto(
    val name: String? = null,
    val registration: String? = null,
    val phone: String? = null,
    val yearsInOperation: Int? = null,
    val address: AddressDto? = null,
    val numberOfJobs: Int? = null,
    val industry: Industry? = null,
    val businessStage: String? = null,
    val bbbee: String? = null,
    val staffComplement: String? = null,
    val description: String? = null
)