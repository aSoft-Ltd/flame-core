package flame

sealed interface SmeKey {
    val name: String
    val route: String

    enum class Admin : SmeKey {
        contacts, businesses, legal, shareholders, directors;

        override val route by lazy { "admin/$name" }
    }

    enum class Funding : SmeKey {
        investment, breakdown, acquisition;

        override val route by lazy { "funding/$name" }
    }

    enum class Finance : SmeKey {
        office;

        override val route by lazy { "finance/$name" }
    }
}