package flame

class OwnSmeReference(
    val load: () -> String,
    val update: () -> String,
) {
    companion object {
        fun messages() = OwnSmeReference(
            load = { "Loading sme info" },
            update = { "Updating your sme" },
        )

        fun endpoint(root: String) = OwnSmeReference(
            load = { "$root/sme/load" },
            update = { "$root/sme/update" },
        )
    }
}