package flame

import koncurrent.Later

interface SmeScheme {
    fun update(sme: SmeDto): Later<SmeDto>
}