package oop_139507_Damian.Tugas_week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran sebesar Rp$amount berhasil. Sisa saldo: Rp$balance")
        } else {
            println("[$accountName] Saldo tidak cukup. Transaksi gagal.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top up sebesar Rp$amount berhasil. Saldo sekarang: Rp$balance")
    }
}