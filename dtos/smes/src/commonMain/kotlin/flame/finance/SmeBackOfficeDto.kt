@file:JsExport
package flame.finance

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class SmeBackOfficeDto(
    val accounting: String? = null,
    val payroll: String? = null,
    val accountingConsultation: String? = null,
    val noOfEmployeesInTheFinanceDepartment: Int? = null,
    val financialHead: String? = null,
    val totalStaffCompliment: Int? = null,
    val hrConsultation: String? = null,
    val policyExistence: String? = null,
    val policyReviewFrequency: String? = null,
    val assetsAssurance: String? = null,
    val criticalSystems: String? = null
)