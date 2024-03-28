package flame

class SmeEndpoint(private val base: String) {

    private val root = "$base/sme"
    fun load() = "$root/info"
    fun save(key: SmeKey) = "$root/${key.route}"

    fun smes() = "$base/smes"

    fun create() = "$base/smes"

    fun update() = "$base/smes"

    fun load(uid: String) = "$root/$uid"

    fun documents() = "$root/documents"
}