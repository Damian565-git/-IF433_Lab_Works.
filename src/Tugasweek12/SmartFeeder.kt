package oop_139507_Damian.Tugasweek12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    // Gunakan fungsi bawaan Kotlin require
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    // Validasi hardware
    if (isJammed) {
        throw DispenserJamException()
    }

    // Validasi stok makanan
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    // Jika semua aman
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}
fun main() {
    // Setup main system
    var currentKibbleStock = 50

    // Jadwal Makan 1: Eksekusi dengan Multiple Catch
    println("=== JADWAL MAKAN PAGI ===")
    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    } catch (e: DispenserJamException) {
        println("Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Error: ${e.message}")
    } catch (e: Exception) {
        println("Error umum: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    // Jadwal Makan 2: Eksekusi dengan runCatching
    println("\n=== JADWAL MAKAN SORE ===")
    runCatching {
        dispenseKibble(
            requestedGram = 30,
            availableGram = 1000,
            isJammed = false
        )
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }.onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
        println("(Opsional: Berikan chicken jerky secara manual)")
    }
}