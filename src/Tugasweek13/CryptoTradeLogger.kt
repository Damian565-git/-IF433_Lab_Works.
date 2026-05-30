package oop_139507_Damian.Tugasweek13

import java.io.File
import java.io.FileNotFoundException
import java.io.PrintWriter

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id, $symbol, $type, $margin, $pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(", ")
        if (parts.size != 5) {
            println("(Log) Data korup (jumlah field tidak sesuai): $line")
            return null
        }
        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
    } catch (e: NumberFormatException) {
        println("(Log) Data korup (format number error): $line")
        null
    } catch (e: IndexOutOfBoundsException) {
        println("(Log) Data korup (index out of bounds): $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { writer.println(it.toCsv()) }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    // Mock data
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 1000.0, 250.75),
        TradeRecord(2, "ETHUSDT", "Short", 500.0, 125.50)
    )
    saveTrades(trades, "crypto_trades.csv")

    // Inject malformed data
    File("crypto_trades.csv").appendText("CORRUPT_ID, DOGEUSDT, Hold, XX, YY\n")

    // Load and calculate
    val loadedData = loadTrades("crypto_trades.csv")
    val totalPnL = loadedData.sumOf { it.pnl }

    println("=== LOADED TRADES ===")
    loadedData.forEach { println(it) }
    println("==== TOTAL PnL BERSIH: $$totalPnL ====")
}