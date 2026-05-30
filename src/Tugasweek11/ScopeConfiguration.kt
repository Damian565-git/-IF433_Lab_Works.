package oop_139507_Damian.Tugasweek11

ata class User(var name: String = "", var age: Int = 0)

fun main() {
    val user = User().apply {
        name = "John"
        age = 30
    }
}