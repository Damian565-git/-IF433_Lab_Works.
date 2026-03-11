package oop_139507_Damian.Tugas_week06

// Kontrak untuk metode pembayaran
interface PaymentMethod {
    fun pay(amount: Double)  // Abstract method
    fun validate(): Boolean = true  // Default method
}