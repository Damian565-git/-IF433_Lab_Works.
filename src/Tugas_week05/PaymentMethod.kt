package oop_139507_Damian.Tugas_week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}