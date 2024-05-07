package flame

import flame.admin.SmeBusinessDto
import kollections.List
import koncurrent.Later
import kronecker.LoadOptions

interface MonSmeScheme : SmeScheme {

    fun create(params: SmeBusinessDto): Later<SmeDto>

    fun list(options: LoadOptions = LoadOptions()): Later<List<SmeDto>>

    fun load(uid: String): Later<SmeDto>
}