

fun String?.isNotNullOrEmpty() = !this.isNullOrEmpty()

fun String.toTitleCase(separator: String = " ") = this
    .split(separator)
    .joinToString(
        separator = separator
    ) { word ->
        word[0].uppercase() + word.substring(1)
    }
