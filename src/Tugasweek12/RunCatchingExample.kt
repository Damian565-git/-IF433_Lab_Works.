package oop_139507_Damian.Tugasweek12

fun main() {
    val result = runCatching {
        "100".toInt()
    }.onSuccess { v ->
        println("Berhasil dikonversi: $v")
    }.onFailure { e ->
        println("Gagal konversi: ${e.message}")
    }

    // Pattern: getOrElse
    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    // Pattern: recover (bisa mengubah tipe kegagalan jadi sukses)
    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")
}