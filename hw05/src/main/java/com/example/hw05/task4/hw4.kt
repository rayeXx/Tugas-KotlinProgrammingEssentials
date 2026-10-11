package com.example.hw05.task4

data class Config(var host: String = "", var port: Int = 0, var debug: Boolean = false)

fun main() {
    // 1. Menggunakan apply untuk konfigurasi objek dalam single expression
    val config = Config().apply {
        host = "localhost"
        port = 8080
        debug = true
    }
    println(config)

    // 2. Menggunakan let untuk print uppercase hanya saat tidak null
    val name: String? = "Rina"
    name?.let {
        println(it.uppercase())
    }

    // 3. Menggunakan also dalam satu chain pada MutableList
    val numbers = mutableListOf(1, 2, 3)
    numbers
        .also { println("Before: $it") }
        .add(4)
        .also { println("After: $numbers") }
}