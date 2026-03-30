package oop_139507_Damian.Tugas_week07

// Singleton Game Manager
object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        } else {
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }

    fun stopGame() {
        if (isGameRunning) {
            isGameRunning = false
            println("Menghentikan Game Engine...")
        } else {
            println("Game tidak sedang berjalan.")
        }
    }
}