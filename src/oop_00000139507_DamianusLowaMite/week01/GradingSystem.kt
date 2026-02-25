package ooop_139507_Damian.week01

fun calculateStatus(score: Int) =
    if (score > 75) "Lulus" else "Tidak lulus"

fun main() {
    val name: String = "Jhon Thor"
    val score: Int = 80

    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
    println("Status: ${calculateStatus(score)}")

    val student: String? = null
    val idLength = student?.length ?: 0

    println("Panjang ID: $idLength")
}
