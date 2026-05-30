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