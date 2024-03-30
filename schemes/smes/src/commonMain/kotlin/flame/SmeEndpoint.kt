package flame

class SmeEndpoint(base: String) {

    private val root = "$base/sme"

    fun documents() = "$root/documents"
}