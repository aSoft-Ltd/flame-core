package flame

import koncurrent.Later

interface OwnSmeScheme : SmeScheme {
    fun load(): Later<SmeDto>
}