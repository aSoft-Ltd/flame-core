package flame

class SmeRoutes(private val base: String) {

    private val root = "$base/sme"
    fun load() = "$root/info"
    fun save(key: SmeKey) = "$root/${key.route}"
}