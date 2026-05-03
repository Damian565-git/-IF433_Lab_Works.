package oop_139507_Damian.Tugas_week09

// CHECKPOINT 11
fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 25, 8.3, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 15, 12.0, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 30, -10.5, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 20, 22.1, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, -2.5, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 15, 5.8, "CLOSED")
    )

    println("=== CRYPTO TRADING DASHBOARD ===")
    println("Total trades recorded: ${tradeHistory.size}")

    // CHECKPOINT 12
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    println("\n[1] Closed trades: ${closedTrades.size}")

    // CHECKPOINT 13
    val winningTrades = closedTrades.filter { it.roe > 0 }
    println("[2] Winning trades: ${winningTrades.size}")

    // CHECKPOINT 14
    val losingTrades = closedTrades.filter { it.roe <= 0 }
    println("[3] Losing trades: ${losingTrades.size}")

    // CHECKPOINT 15
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}] : +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // CHECKPOINT 16
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}] : ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // CHECKPOINT 17
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    // CHECKPOINT 18 & 19
    println("\n=== TOP PERFORMERS (WINNERS) ===")
    topPerformersString.forEach { println(it) }

    println("\n=== WORST PERFORMERS (LOSERS) ===")
    worstPerformersString.forEach { println(it) }

    println("\n=== UNIQUE TRADING PAIRS ===")
    println(uniquePairs)

    // Bonus: Win Rate Calculation
    val winRate = if (closedTrades.isNotEmpty()) {
        (winningTrades.size.toDouble() / closedTrades.size) * 100
    } else 0.0
    println("\n=== WIN RATE ===")
    println("${String.format("%.1f", winRate)}% (${winningTrades.size}/${closedTrades.size})")
}