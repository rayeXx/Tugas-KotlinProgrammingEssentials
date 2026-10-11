package com.example.hw03.task3

fun main() {
    var studentName: String? = null

    // 1. Length secara aman dengan safe call (?.)
    println("Length: ${studentName?.length}")

    // 2. Elvis operator (?:) jika null cetak "Unknown"
    println("Name: ${studentName ?: "Unknown"}")

    // 3. Hanya cetak sapaan jika tidak null menggunakan ?.let
    studentName?.let {
        println("Hello, $it!")
    }
}