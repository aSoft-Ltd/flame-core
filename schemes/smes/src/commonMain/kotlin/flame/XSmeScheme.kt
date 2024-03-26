package flame

import koncurrent.Later

interface XSmeScheme {
    fun update(sme: SmeDto): Later<SmeDto>
}