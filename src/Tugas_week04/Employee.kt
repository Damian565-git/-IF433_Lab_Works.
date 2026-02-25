package oop_139507_Damian.Tugas_week04

// Parent class Employee
open class Employee(val name: String, val baseSalary: Int) {

    // Method work yang bisa di-override
    open fun work() {
        println("$name sedang bekerja.")
    }

    // Method calculateBonus yang bisa di-override
    open fun calculateBonus(): Int {
        // Bonus 10% dari baseSalary
        return (baseSalary * 0.1).toInt()
    }
}