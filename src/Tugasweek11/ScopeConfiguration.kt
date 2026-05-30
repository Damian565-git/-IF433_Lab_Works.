package oop_139507_Damian.Tugasweek11

data class User(var name: String = "", var age: Int = 0)

fun main() {
    // apply untuk inisialisasi
    val user = User().apply {
        name = "John"
        age = 30
    }
    println("User after apply: $user")

    // also untuk logging side effects
    val userAlso = User("Jane", 25).also {
        println("User created: $it")
    }

    // with untuk multiple operations
    with(user) {
        println("Name: $name, Age: $age")
    }

    // combine apply and also
    val newUser = User("Budi", 20).apply {
        age = 21
    }.also {
        println("User baru berhasil dibuat: $it")
    }
}