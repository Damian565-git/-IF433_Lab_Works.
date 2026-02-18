package oop_139507_Damian.week03

class Employee(
    val id: String,
    val name: String
) {
    var salary: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value
                println("Gaji $name diupdate menjadi $value")
            } else {
                println("ERROR: Gaji tidak boleh negatif!")
            }
        }

    // Private property untuk performance rating
    private var performanceRating: Int = 3

    // Public function untuk mengubah rating secara aman
    fun updatePerformanceRating(newRating: Int) {
        if (newRating in 1..5) {
            performanceRating = newRating
            println("Performance rating untuk $name diupdate menjadi $newRating")
        } else {
            println("ERROR: Rating harus antara 1-5!")
        }
    }

    // Function untuk melihat rating (getter)
    fun getPerformanceRating(): Int {
        return performanceRating
    }

    // Function untuk menampilkan info employee
    fun displayInfo() {
        println("""
            ===== EMPLOYEE INFO =====
            ID: $id
            Name: $name
            Salary: Rp ${String.format("%,.0f", salary)}
            Performance Rating: $performanceRating/5
            =========================
        """.trimIndent())
    }
}

fun main() {
    println("=== TESTING EMPLOYEE ENCAPSULATION ===")
    val e = Employee("E01", "Damian")

    // Testing Salary
    println("\n--- Testing Salary ---")
    println("Mencoba set salary = 5000.0")
    e.salary = 5000.0

    println("\nMencoba set salary = -1000.0")
    e.salary = -1000.0

    println("\nMencoba set salary = 7500.0")
    e.salary = 7500.0

    // Testing Performance Rating
    println("\n--- Testing Performance Rating ---")
    println("Mencoba update rating ke 5")
    e.updatePerformanceRating(5)
    println("Performance rating sekarang: ${e.getPerformanceRating()}/5")

    println("\nMencoba update rating ke 10 (harus error)")
    e.updatePerformanceRating(10)
    println("Performance rating sekarang: ${e.getPerformanceRating()}/5")

    println("\nMencoba update rating ke 3")
    e.updatePerformanceRating(3)
    println("Performance rating sekarang: ${e.getPerformanceRating()}/5")

    // Display complete info
    println("\n--- Complete Employee Info ---")
    e.displayInfo()
}