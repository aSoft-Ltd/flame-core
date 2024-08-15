package flame

class OwnSmeReference(
    val load: () -> String,
//    val upload: (name: String) -> String,
    val uploadResume: (name: String) -> String,
    val update: () -> String,
    val xlsx: (name: String) -> String,
    val documents: OwnSmeDocumentReference
) {
    companion object {
        fun messages() = OwnSmeReference(
            load = { "Loading sme info" },
//            upload = { "Uploading $it" },
            uploadResume = { "Uploading Resume $it" },
            update = { "Updating your sme" },
            xlsx = { "Uploading spreadsheet" },
            documents = OwnSmeDocumentReference(
                upload = { "Uploading $it" },
                delete = { "Deleting document $it" },
            )
        )

        fun endpoint(root: String) = OwnSmeReference(
            load = { "$root/sme/load" },
//            upload = { "$root/sme/document/$it" },
            uploadResume = { "$root/sme/resume/$it" },
            update = { "$root/sme/update" },
            xlsx = { "$root/sme/xlsx/$it" },
            documents = OwnSmeDocumentReference(
                upload = { "$root/sme/document/$it" },
                delete = { "$root/sme/document/$it/delete" },
            )
        )
    }

    class OwnSmeDocumentReference(
        val upload: (name: String) -> String,
        val delete: (name: String) -> String,
    )
}