package oop_139507_Damian.Tugas_week07

// Singleton menggunakan keyword object
object DatabaseManager {
    // Properti yang bisa diakses langsung tanpa instansiasi
    val connectionStatus: String = "Disconnected"

    fun connect() {
        println("Database connected successfully!")
    }

    fun disconnect() {
        println("Database disconnected!")
    }
}