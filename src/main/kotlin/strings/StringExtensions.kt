

fun String?.isNotNullOrEmpty() = !this.isNullOrEmpty()

fun String.toTitleCase(separator: String = " ") = this
    .split(separator)
    .map { word ->
        word[0].uppercase() + word.substring(1)
    }
    .joinToString(
        separator = separator
    )
