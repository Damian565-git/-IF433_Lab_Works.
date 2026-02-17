package oop_139507_Damian.week02

class Student(
    val nim: String,
    val name: String,
    var major: String
) {

    init {
        if (nim.length != 8) {
            println("WARNING: NIM tidak valid!")
        }
    }

    constructor(nim: String, name: String)
            : this(nim, name, "Non-Matriculated")
}

