package com.example.hw02.com.example.hw02.task4

// Fungsi Part A
fun calculateStudyMinutes(sessions: Int, minutesPerSession: Int): Int {
    return sessions * minutesPerSession
}

// Fungsi Part B
fun calculateTotalCredits(courses: Int, creditsPerCourse: Int): Int {
    return courses * creditsPerCourse
}

fun main() {
    // --- Part A ---
    val total1 = calculateStudyMinutes(3, 25)
    println("Total study time: $total1 minutes")

    val total2 = calculateStudyMinutes(4, 30)
    println("Total study time: $total2 minutes")

    // --- Part B ---
    for (courses in 1..5) {
        val credits = calculateTotalCredits(courses, 3)
        println("Courses: $courses, total credits: $credits")
    }
}