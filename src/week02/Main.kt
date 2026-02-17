package oop_139507_Damian.week02

import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)

    print("Masukkan NIM (8 digit): ")
    val nim = input.nextLine()

    if (nim.length != 8) {
        println("NIM salah! Program berhenti.")
        return
    }

    print("Masukkan Nama: ")
    val name = input.nextLine()

    print("Masukkan Jurusan: ")
    val major = input.nextLine()

    val student = Student(nim, name, major)

    println("\nData Mahasiswa:")
    println("NIM: ${student.nim}")
    println("Nama: ${student.name}")
    println("Jurusan: ${student.major}")
}
