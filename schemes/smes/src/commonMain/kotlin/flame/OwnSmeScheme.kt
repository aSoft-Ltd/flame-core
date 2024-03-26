package flame

import koncurrent.Later

interface OwnSmeScheme : XSmeScheme {
    fun load(): Later<SmeDto>
}