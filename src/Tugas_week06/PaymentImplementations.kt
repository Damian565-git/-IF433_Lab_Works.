package oop_139507_Damian.Tugas_week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("Processing Rp$amount via Gopay Server")
        println("Menggunakan saldo Gopay: Rp${amount}")
    }

    override fun validate(): Boolean {
        println("Memvalidasi akun Gopay...")
        return true
    }

    fun checkBalance() {
        println("Cek saldo Gopay: Rp500.000")
    }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {
        println("Contacting Bank for Rp$amount")
        println("Transaksi dengan kartu kredit diproses")
    }

    override fun validate(): Boolean {
        println("Memvalidasi kartu kredit...")
        println("Mengirim OTP ke nomor terdaftar...")
        return true
    }

    fun getPoints() {
        println("Mendapatkan 100 reward points!")
    }
