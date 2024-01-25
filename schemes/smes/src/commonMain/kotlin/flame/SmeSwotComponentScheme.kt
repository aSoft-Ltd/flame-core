package flame

import kollections.List
import koncurrent.Later

interface SmeSwotComponentScheme {
    fun update(params: List<String>) : Later<SmeDto>
}