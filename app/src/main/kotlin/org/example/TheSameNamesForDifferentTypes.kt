package org.example

// source: https://kotlinlang.org/docs/java-to-kotlin-interop.html#handling-signature-clashes-with-jvmname

fun List<String>.filterValid(): List<String> {
    return if (this.isEmpty()) emptyList<String>() else this.filter { it != "" }
}

@JvmName("filterValidInt")
fun List<Int>.filterValid(): List<Int> {
    return if (this.isEmpty()) emptyList<Int>() else this.filter { it != 0 }
}