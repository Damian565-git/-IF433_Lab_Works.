package oop_139507_Damian.week03

class Employee(
    val id: String,
    val name: String
) {
    var salary: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value  // BENAR! Menggunakan backing field, BUKAN this.salary
                println("Gaji $name diupdate menjadi $value")
            } else {
                println("ERROR: Gaji tidak boleh negatif!")
                // field tetap bernilai lama, tidak diubah
            }
        }
}

fun main() {
    val e = Employee("E01", "Damian")

    println("=== TESTING EMPLOYEE ===")
    println("Mencoba set salary = 5000.0")
    e.salary = 5000.0
    println("Salary: ${e.salary}")

    println("\nMencoba set salary = -1000.0")
    e.salary = -1000.0
    println("Salary: ${e.salary}")

    println("\nMencoba set salary = 7500.0")
    e.salary = 7500.0
    println("Salary: ${e.salary}")
}