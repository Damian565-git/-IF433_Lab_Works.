package oop_139507_Damian.Tugas_week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran sebesar Rp$amount berhasil. Sisa limit: Rp${limit - usedAmount}")
        } else {
            println("[$accountName] Limit tidak mencukupi. Transaksi ditolak.")
        }
    }
}