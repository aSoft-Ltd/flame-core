package flame

class SmeEndpoint(private val base: String) {

    private val root = "$base/sme"
    fun load() = "$root/info"
    fun save(key: SmeKey) = "$root/${key.route}"

    fun smes() = "$base/smes"

    fun documents() = "$root/documents"
}