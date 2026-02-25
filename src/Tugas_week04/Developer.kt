package oop_139507_Damian.Tugas_week04

// Developer merupakan child dari Employee dengan property tambahan
class Developer(name: String, baseSalary: Int, val programmingLanguage: String)
    : Employee(name, baseSalary) {

    // Override method work
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

    // calculateBonus() tidak di-override, menggunakan implementasi dari Employee
}