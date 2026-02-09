fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 750000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}
fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("=== SteamKW Receipt ===")
    println("Game Title  : $title")
    println("Final Price: Rp $finalPrice")
    println("Note       : ${note ?: "Tidak ada catatan"}")
}
