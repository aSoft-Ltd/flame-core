package flame

class OwnSmeReference(
    val load: () -> String,
    val upload: (name: String) -> String,
    val update: () -> String,
) {
    companion object {
        fun messages() = OwnSmeReference(
            load = { "Loading sme info" },
            upload = { "Uploading $it" },
            update = { "Updating your sme" },
        )

        fun endpoint(root: String) = OwnSmeReference(
            load = { "$root/sme/load" },
            upload = { "$root/sme/document/$it" },
            update = { "$root/sme/update" },
        )
    }
}