package flame

import kollections.List
import koncurrent.Later
import kronecker.LoadOptions

interface SmeMonitorScheme {
    fun list(options: LoadOptions = LoadOptions()): Later<List<SmeDto>>

    fun load(uid: String): Later<SmeDto>

    fun update(sme: SmeDto): Later<SmeDto>
}