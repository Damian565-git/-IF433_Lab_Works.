package oop_139507_Damian.Tugas_week04

// Manager merupakan child dari Employee
class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    // Override method work
    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    // Override method calculateBonus
    override fun calculateBonus(): Int {
        // Bonus standar (panggil super) ditambah Rp 500.000
        return super.calculateBonus() + 500000
    }
}