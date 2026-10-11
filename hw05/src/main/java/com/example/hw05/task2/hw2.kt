package com.example.hw05.task2

// 1. Fungsi applyTwice: menerapkan operasi dua kali
fun applyTwice(n: Int, operation: (Int) -> Int): Int {
    return operation(operation(n))
}

// 2. Fungsi printIf: mencetak item yang memenuhi kondisi
fun printIf(items: List<String>, condition: (String) -> Boolean) {
    items.forEach { item ->
        if (condition(item)) {
            println(item)
        }
    }
}

// 3. Fungsi generic transform: memetakan list T menjadi List<String>
fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> {
    return list.map(mapper)
}

fun main() {
    // Uji 1: applyTwice dengan double lambda
    val doubleOp: (Int) -> Int = { it * 2 }
    println(applyTwice(3, doubleOp)) // Hasil: 12

    // Uji 2: printIf dengan daftar mata kuliah dan cek vokal
    val courses = listOf("Algorithms", "Operating Systems", "English", "Database", "Interaction")
    val startsWithVowel: (String) -> Boolean = { str ->
        str.firstOrNull()?.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')
    }
    printIf(courses, startsWithVowel)

    // Uji 3: transform untuk kuadrat bilangan menjadi String
    val numbers = listOf(2, 3, 4)
    val squaredStrings = transform(numbers) { (it * it).toString() }
    println(squaredStrings) // Hasil: ["4", "9", "16"]
}