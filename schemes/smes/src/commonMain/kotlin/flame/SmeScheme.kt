package flame

import koncurrent.Later

interface SmeScheme {
    val documents: SmeDocumentsScheme
    fun load(): Later<SmeDto>
}