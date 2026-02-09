fun printReceipt(title: String, finalPrice: Int) {
    println("=== SteamKW Receipt ===")
    println("Game Title  : $title")
    println("Final Price: Rp $finalPrice")
}
fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 750000

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice
    )
}
