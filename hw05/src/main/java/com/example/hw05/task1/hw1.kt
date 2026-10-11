package com.example.hw05.task1

class hw1package com.example.hw05.task1

fun main() {
    // 1. Lambda double Int dengan tipe (Int) -> Int
    val doubleValue: (Int) -> Int = { it * 2 }
    println(doubleValue(7))

    // 2. Lambda cek huruf vokal diawal string dengan tipe (String) -> Boolean
    val startsWithVowel: (String) -> Boolean = { str ->
        val firstChar = str.firstOrNull()?.lowercaseChar()
        firstChar in listOf('a', 'e', 'i', 'o', 'u')
    }
    println(startsWithVowel("apple"))
    println(startsWithVowel("Banana"))
    println(startsWithVowel("orange"))

    // 3. Lambda mencari nilai terbesar dengan tipe (Int, Int) -> Int
    val maxOfTwo: (Int, Int) -> Int = { a, b -> if (a > b) a else b }
    println(maxOfTwo(12, 7))
} {
}