package flame

interface SmeScheme {
    val admin: SmeAdminScheme
    val funding: SmeFundingScheme
}