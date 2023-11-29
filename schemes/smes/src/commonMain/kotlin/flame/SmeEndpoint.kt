package flame

class SmeEndpoint(base: String) {

    private val root = "$base/sme"
    fun load() = "$root/info"
    fun save(key: SmeKey) = "$root/${key.route}"

    fun documents() = "$root/documents"
}