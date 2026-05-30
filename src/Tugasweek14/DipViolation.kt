package oop_139507_Damian.Tugasweek14

// Concrete low-level module
class MySQLDatabase {
    fun query(sql: String): List<String> = listOf("data1", "data2")
}

// High-level module tightly coupled dengan MySQLDatabase
class UserService {
    private val database = MySQLDatabase() // Hard-coded! Tightly coupled!

    fun getUser(id: Int): List<String> {
        return database.query("SELECT * FROM users WHERE id=$id")
    }
}

fun main() {
    val userService = UserService()
    println("User data: ${userService.getUser(1)}")
    // Sulit untuk mengganti ke database lain (PostgreSQL, MongoDB, etc)
}