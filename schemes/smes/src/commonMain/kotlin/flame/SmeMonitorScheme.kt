package flame

import kollections.List
import koncurrent.Later
import kronecker.LoadOptions

interface SmeMonitorScheme {
    fun list(options: LoadOptions = LoadOptions()): Later<List<SmeDto>>
}