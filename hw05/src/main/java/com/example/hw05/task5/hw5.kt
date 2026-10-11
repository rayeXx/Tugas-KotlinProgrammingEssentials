package com.example.hw05.task5

import java.util.Locale

data class Student(val name: String, val score: Int, val year: Int)

fun main() {
    val students = listOf(
        Student("Ali", 85, 2023),
        Student("Budi", 62, 2022),
        Student("Citra", 91, 2023),
        Student("Dewi", 58, 2022),
        Student("Eka", 76, 2023)
    )

    // 1. partition untuk memisahkan lulus (>= 70) dan tidak lulus
    val (passing, failing) = students.partition { it.score >= 70 }
    println("Passing: ${passing.size}   Failing: ${failing.size}")

    // 2. maxByOrNull dan minByOrNull ditangani dengan ?.let
    students.maxByOrNull { it.score }?.let {
        println("Top scorer : ${it.name} (${it.score})")
    }
    students.minByOrNull { it.score }?.let {
        println("Low scorer : ${it.name} (${it.score})")
    }

    // 3. fold untuk menghitung rata-rata dibulatkan ke 1 desimal
    val totalScore = students.fold(0) { acc, student -> acc + student.score }
    val averageScore = totalScore.toDouble() / students.size
    val formattedAverage = String.format(Locale.US, "%.1f", averageScore)
    println("Class average: $formattedAverage")

    // 4. Membangun tabel ringkasan nilai dengan buildString
    val report = buildString {
        appendLine("--- Grade Report ---")
        students.forEach { student ->
            val status = if (student.score >= 70) "PASS" else "FAIL"
            appendLine(String.format(Locale.US, "%-8s %-3d %s", student.name, student.score, status))
        }
    }
    print(report)
}