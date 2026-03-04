package oop_139507_Damian.Tugas_week05

fun main() {
    // === GUIDED LAB ===
    println("========== GUIDED LAB ==========")

    // Membuat polymorphic collection
    val daftarPegawai: List<Pegawai> = listOf(
        Dosen("Budi", "12345678"),
        Admin("Siti")
    )

    // Polymorphic behavior: memanggil method yang dioverride
    println("\n=== Semua Pegawai Bekerja ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
    }

    println("\n=== Smart Casting dengan 'is' ===")
    for (pegawai in daftarPegawai) {
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------------")
    }

    // === TUGAS MANDIRI 1: Method Overloading ===
    println("\n========== TUGAS MANDIRI 1: METHOD OVERLOADING ==========")
    val mathHelper = MathHelper()

    println("Luas Persegi (sisi 5)        : ${mathHelper.hitungLuas(5)}")
    println("Luas Persegi Panjang (4 x 7)  : ${mathHelper.hitungLuas(4, 7)}")
    println("Luas Lingkaran (jari2 7.0)    : ${mathHelper.hitungLuas(7.0)}")

    // === TUGAS MANDIRI 2: Sistem Pembayaran ===
    println("\n========== TUGAS MANDIRI 2: SISTEM PEMBAYARAN ==========")

    // Buat objek EWallet dan CreditCard
    val eWallet = EWallet("Budi", 50000.0)
    val creditCard = CreditCard("Ani", 100000.0)

    // Masukkan ke dalam list bertipe PaymentMethod
    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

    // Lakukan perulangan dan panggil processPayment
    println("\n--- Proses Pembayaran Pertama (Rp75000) ---")
    for (paymentMethod in paymentMethods) {
        paymentMethod.processPayment(75000.0)
    }

    // Smart Casting Challenge
    println("\n--- Smart Casting: Top Up EWallet dan Coba Lagi ---")
    for (paymentMethod in paymentMethods) {
        if (paymentMethod is EWallet) {
            println("Mendeteksi EWallet... melakukan top up Rp50000")
            paymentMethod.topUp(50000.0)
            println("Mencoba pembayaran Rp75000 lagi:")
            paymentMethod.processPayment(75000.0)
        }
    }
}