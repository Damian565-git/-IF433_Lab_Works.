package oop_139507_Damian.Tugas_week09

// CHECKPOINT 10
data class TradeLog(
    val pair: String,
    val position: String,  // "LONG" or "SHORT"
    val leverage: Int,
    val roe: Double,       // Return on Equity in percentage
    val status: String     // "OPEN" or "CLOSED"
)