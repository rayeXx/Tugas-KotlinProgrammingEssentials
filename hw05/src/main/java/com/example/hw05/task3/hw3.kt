package com.example.hw05.task3

data class Student(val name: String, val score: Int, val year: Int)

fun main() {
    val students = listOf(
        Student("Ali", 85, 2023),
        Student("Budi", 62, 2022),
        Student("Citra", 91, 2023),
        Student("Dewi", 58, 2022),
        Student("Eka", 76, 2023)
    )

    // 1. filter skor >= 70 dan hitung jumlahnya
    val passingCount = students.filter { it.score >= 70 }.count()
    println("Passing count: $passingCount")

    // 2. map format "Name (Score)" dan cetak dengan forEach
    students.map { "${it.name} (${it.score})" }.forEach { println(it) }

    // 3. sortedByDescending dan ambil 3 nama teratas
    println("Top 3 students:")
    students.sortedByDescending { it.score }
        .take(3)
        .forEach { println(it.name) }

    // 4. fold untuk total nilai dan hitung rata-rata
    val totalScore = students.fold(0) { sum, student -> sum + student.score }
    val averageScore = totalScore.toDouble() / students.size
    println("Total: $totalScore   Average: $averageScore")

    // 5. groupBy berdasarkan tahun angkatan
    val groupedByYear = students.groupBy { it.year }
    groupedByYear.forEach { (year, studentList) ->
        val names = studentList.map { it.name }
        println("$year: $names")
    }
}