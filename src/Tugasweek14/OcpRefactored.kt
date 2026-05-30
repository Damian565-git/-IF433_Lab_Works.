package oop_139507_Damian.Tugasweek14

// CHECKPOINT 6: Interface abstraksi
interface DiscountStrategy {
    fun apply(price: Double): Double
}

// CHECKPOINT 6: Implementasi konkret
class StudentDiscount : DiscountStrategy {
    override fun apply(price: Double) = price * 0.80
}

class MemberDiscount : DiscountStrategy {
    override fun apply(price: Double) = price * 0.85
}

class EmployeeDiscount : DiscountStrategy {
    override fun apply(price: Double) = price * 0.70
}

// CHECKPOINT 7: Calculator bergantung pada abstraksi
class SafeDiscountCalculator(private val strategy: DiscountStrategy) {
    fun calculate(price: Double) = strategy.apply(price)
}

// CHECKPOINT 8: Diskon baru tanpa modifikasi class lama
class SeniorDiscount : DiscountStrategy {
    override fun apply(price: Double) = price * 0.75
}

class VipDiscount : DiscountStrategy {
    override fun apply(price: Double) = price * 0.60
}

fun main() {
    val studentCalc = SafeDiscountCalculator(StudentDiscount())
    val memberCalc = SafeDiscountCalculator(MemberDiscount())
    val seniorCalc = SafeDiscountCalculator(SeniorDiscount())
    val vipCalc = SafeDiscountCalculator(VipDiscount())

    println("Student discount: ${studentCalc.calculate(100.0)}")
    println("Member discount: ${memberCalc.calculate(100.0)}")
    println("Senior discount: ${seniorCalc.calculate(100.0)}")
    println("VIP discount: ${vipCalc.calculate(100.0)}")
}