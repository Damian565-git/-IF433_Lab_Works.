//package oop_139507_Damian.Tugas_week09
//
//fun main() {
//    // Repository untuk Coin
//    val coinRepo = WalletRepository<Coin>()
//
//    // Menambahkan 3 koin
//    coinRepo.add(Coin("BTC", 0.5))
//    coinRepo.add(Coin("ETH", 5.0))
//    coinRepo.add(Coin("USDT", 1000.0))
//
//    // Repository untuk Transaction
//    val txRepo = WalletRepository<Transaction>()
//    txRepo.add(Transaction("TX001", 500.0))
//    txRepo.add(Transaction("TX002", 250.0))
//    txRepo.add(Transaction("TX003", 750.0))
//
//    // Menampilkan data Coin
//    val coinResponse = ApiResponse("200 OK", coinRepo.getAll())
//    println("=== CRYPTO WALLET DASHBOARD ===")
//    println("Status: ${coinResponse.status}")
//    println("Daftar Koin:")
//    coinResponse.data.forEach { coin ->
//        println("  - ${coin.name}: ${coin.balance} USD")
//    }
//
//    // Menampilkan data Transaction
//    val txResponse = ApiResponse("200 OK", txRepo.getAll())
//    println("\n=== TRANSACTION HISTORY ===")
//    println("Status: ${txResponse.status}")
//    println("Daftar Transaksi:")
//    txResponse.data.forEach { tx ->
//        println("  - ID: ${tx.id}, Amount: ${tx.amount} USD")
//    }
//}