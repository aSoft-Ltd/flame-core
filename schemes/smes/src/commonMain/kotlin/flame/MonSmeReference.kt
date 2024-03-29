package flame

class MonSmeReference(
    val load: (uid: String) -> String,
    val list: () -> String,
    val create: () -> String,
    val update: () -> String,
) {
    companion object {
        fun messages() = MonSmeReference(
            load = { uid -> "Loading sme ($uid) info" },
            list = { "Loading all smes" },
            create = { "Creating sme" },
            update = { "Updating sme" },
        )

        fun endpoint(root: String) = MonSmeReference(
            load = { uid -> "$root/sme/$uid" },
            list = { "$root/sme/list" },
            create = { "$root/sme/create" },
            update = { "$root/sme/update" },
        )
    }
}