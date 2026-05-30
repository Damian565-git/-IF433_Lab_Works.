package oop_139507_Damian.Tugasweek14

class DiscountCalculator {
    fun calculate(price: Double, type: String): Double {
        return when (type) {
            "student" -> price * 0.80
            "member" -> price * 0.85
            "employee" -> price * 0.70
            // Setiap ada diskon baru, class ini harus dimodifikasi!
            else -> price
        }
    }
}

fun main() {
    val calculator = DiscountCalculator()
    println("Student discount: ${calculator.calculate(100.0, "student")}")
    println("Member discount: ${calculator.calculate(100.0, "member")}")
    println("Employee discount: ${calculator.calculate(100.0, "employee")}")
}