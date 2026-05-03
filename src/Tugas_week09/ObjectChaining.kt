package oop_139507_Damian.Tugas_week09

// CHECKPOINT 8
data class Student(
    val name: String,
    val grade: Int,
    val major: String
)

fun main() {
    val students = listOf(
        Student("Alice", 85, "Computer Science"),
        Student("Bob", 72, "Engineering"),
        Student("Charlie", 90, "Computer Science"),
        Student("Diana", 68, "Mathematics"),
        Student("Eve", 95, "Engineering"),
        Student("Frank", 78, "Computer Science")
    )

    println("All Students: $students")

    // CHECKPOINT 9
    println("\n== CHAINING RESULT ==")

    val topCsStudents = students
        .filter { it.major == "Computer Science" }  // Filter jurusan CS
        .filter { it.grade >= 80 }                   // Filter nilai >= 80
        .sortedByDescending { it.grade }             // Urutkan dari tertinggi
        .map { "${it.name} - Grade: ${it.grade}" }   // Format string

    println("Top CS Students:")
    topCsStudents.forEach { println("  $it") }
}