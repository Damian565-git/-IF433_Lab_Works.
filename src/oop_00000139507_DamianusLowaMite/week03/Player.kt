package oop_139507_Damian.week03

class Player(val username: String) {
    private var xp: Int = 0
    private var levelUpMessages: MutableList<String> = mutableListOf()

    val level: Int
        get() = (xp / 100) + 1

    val title: String
        get() {
            return when (level) {
                1 -> "Newbie"
                2 -> "Novice"
                3 -> "Apprentice"
                4 -> "Warrior"
                5 -> "Elite"
                6 -> "Master"
                7 -> "Grandmaster"
                8 -> "Legend"
                9 -> "Mythic"
                else -> "IMMORTAL"
            }
        }

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("ERROR: XP amount harus positif! (Diberikan: $amount)")
            return
        }

        val oldLevel = level
        xp += amount
        val newLevel = level

        println(" $username mendapatkan $amount XP!")
        println("   Progress: ${xp % 100}/100 menuju level ${newLevel + 1}")

        if (newLevel > oldLevel) {
            val message = "🎉 LEVEL UP! Selamat $username naik ke level $newLevel ($title)!"
            println(message)
            levelUpMessages.add(message)
        }
    }

    fun getXp(): Int = xp

    fun showLevelUpHistory() {
        if (levelUpMessages.isEmpty()) {
            println(" Belum ada level up")
        } else {
            println(" Riwayat Level Up:")
            levelUpMessages.forEachIndexed { index, message ->
                println("   ${index + 1}. $message")
            }
        }
    }

    fun displayStats() {
        println("""
            ===== PLAYER STATS =====
            Username: $username
            Level: $level ($title)
            XP: $xp / ${(level * 100)} (Next level: ${100 - (xp % 100)} XP lagi)
            Total Level Up: ${levelUpMessages.size}
            ========================
        """.trimIndent())
    }
}

fun main() {
    println("🔷🔷🔷 TESTING PLAYER (TUGAS 2) ")

    val player1 = Player("ThorOdinson")
    val player2 = Player("LokiMischief")

    println("\n Testing Player 1: ${player1.username}")
    println("   Level awal: ${player1.level}")
    // println(player1.xp)  // ERROR! Tidak bisa akses private

    println("\n   Menambahkan XP 50")
    player1.addXp(50)
    player1.displayStats()

    println("\n   Menambahkan XP 60 (harus level up ke 2)")
    player1.addXp(60)
    player1.displayStats()

    println("\n   Menambahkan XP 150 (harus level up ke 3)")
    player1.addXp(150)
    player1.displayStats()

    println("\n   Menambahkan XP -10 (harus error)")
    player1.addXp(-10)

    println("\n Testing Player 2: ${player2.username}")
    println("   Menambahkan XP 95")
    player2.addXp(95)
    player2.displayStats()

    println("\n   Menambahkan XP 10 (harus level up ke 2)")
    player2.addXp(10)
    player2.displayStats()

    println("\n Riwayat Level Up:")
    player1.showLevelUpHistory()
}