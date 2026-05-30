package oop_139507_Damian.Tugasweek11

Data class User(var name: String = "", var age: Int = 0)

fun main() {
    val user = User().apply {
        name = "John"
        age = 30
    }
}

fun main() {
    val userAlso = User("Jane", 25).also {
        println("User created: $it")
    }
}
fun main() {
    with(user) {
        println("Name: $name, Age: $age")
    }
}
val newUser = User("Budi", 20).apply {
    age = 21
}.also {
    println("User baru berhasil dibuat: $it")
}