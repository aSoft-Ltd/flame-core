package flame

import koncurrent.Later

interface SmeScheme {
    val admin: SmeAdminScheme
    val funding: SmeFundingScheme
    val finance: SmeFinanceScheme
    val documents: SmeDocumentsScheme
    val governance: SmeGovernanceScheme
    val swot: SmeSwotScheme
    fun load(): Later<SmeDto>
}