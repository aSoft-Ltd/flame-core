package flame

class SmeActionMessage {
    fun load() = "Loading sme info"

    fun save(key: SmeKey) = "Saving ${key.name} information"

    fun smes() = "Loading all smes"

    fun create() = "Creating sme"
    fun update() = "Updating sme"
}