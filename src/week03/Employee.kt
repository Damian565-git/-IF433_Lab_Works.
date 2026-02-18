package oop_139507_Damian.week03

class Employee(
    val id: String,
    val name: String
) {
    var salary: Double = 0.0
}
var salary: Double = 0.0
    set(value) {
        this.salary = value   // SALAH → menyebabkan infinite recursion
    }
fun main() {
    val e = Employee("E01", "Damian")
    e.salary = 5000.0
}