package oop_139507_Damian.Tugas_week09

fun main() {
    val coinRepo = WalletRepository<Coin>()

    // Menambahkan minimal 3 koin
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 5.0))
    coinRepo.add(Coin("USDT", 1000.0))
}