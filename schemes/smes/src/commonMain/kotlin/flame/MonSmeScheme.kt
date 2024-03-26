package flame

import kollections.List
import koncurrent.Later
import kronecker.LoadOptions

interface MonSmeScheme : XSmeScheme {
    fun list(options: LoadOptions = LoadOptions()): Later<List<SmeDto>>

    fun load(uid: String): Later<SmeDto>
}