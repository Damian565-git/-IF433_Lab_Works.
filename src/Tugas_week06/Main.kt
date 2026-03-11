package oop_139507_Damian.Tugas_week06

// Fungsi ini Decoupled! Tidak peduli kelas aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout dengan amount: Rp$amount")

    // Validasi pembayaran
    if (method.validate()) {
        method.pay(amount)  // Dynamic polymorphism in action
        println("Checkout berhasil!")
    } else {
        println("Checkout gagal: validasi tidak lulus")
    }
    println("--------------------")
}

fun main() {
    println("=== TESTING SMARTWATCH ===")
    val myWatch = Smartwatch()
    myWatch.showTime()
    myWatch.countSteps()
    myWatch.batteryStatus()

    println("\n=== TESTING SMARTPHONE ===")
    val myPhone = Smartphone()
    myPhone.turnOn()
    myPhone.takePhoto()
    myPhone.makeCall("08123456789")

    println("\n=== TESTING PAYMENT METHODS ===")
    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT DENGAN GOPAY ===")
    processCheckout(method = pay1, amount = 50000.0)

    println("\n=== TESTING CHECKOUT DENGAN CREDIT CARD ===")
    processCheckout(method = pay2, amount = 150000.0)

    // Demonstrasi polymorphism
    println("\n=== POLYMORPHISM DEMO ===")
    val paymentMethods: List<PaymentMethod> = listOf(pay1, pay2)
    paymentMethods.forEachIndexed { index, method ->
        println("Payment method ${index + 1}:")
        method.pay(100000.0)
        println()
    }
}