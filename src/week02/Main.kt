package oop_139507_Damian.week02

import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)

    // =============================
    // STUDENT SYSTEM
    // =============================

    println("Pilih Jalur:")
    println("1. Dengan Jurusan")
    println("2. Tanpa Jurusan")

    val choice = input.nextInt()
    input.nextLine()

    print("Masukkan NIM: ")
    val nim = input.nextLine()

    print("Masukkan Nama: ")
    val name = input.nextLine()

    val student = if (choice == 1) {
        print("Masukkan Jurusan: ")
        val major = input.nextLine()
        Student(nim, name, major)
    } else {
        Student(nim, name)
    }

    println("\nData Mahasiswa:")
    println("NIM: ${student.nim}")
    println("Nama: ${student.name}")
    println("Jurusan: ${student.major}")
    println("IPK: ${student.gpa}")

    // =============================
    // LIBRARY SYSTEM
    // =============================

    println("\n=== SISTEM DENDA PERPUSTAKAAN ===")

    print("Judul Buku: ")
    val title = input.nextLine()

    print("Nama Peminjam: ")
    val borrower = input.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = input.nextInt()

    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("Total Denda: Rp ${loan.calculateFine()}")

    // =============================
    // MINI RPG SYSTEM
    // =============================

    println("\n=== MINI RPG BATTLE ===")

    print("Nama Hero: ")
    input.nextLine() // clear buffer
    val heroName = input.nextLine()

    print("Base Damage: ")
    val damage = input.nextInt()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("1. Serang")
        println("2. Kabur")

        val choiceBattle = input.nextInt()

        if (choiceBattle == 1) {

            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("HP Enemy: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                hero.takeDamage(enemyDamage)
                println("HP Hero: ${hero.hp}")
            }

        } else {
            println("Hero kabur!")
            break
        }
    }

    println("=== HASIL ===")

    if (hero.isAlive() && enemyHp == 0) {
        println("Hero Menang!")
    } else if (!hero.isAlive()) {
        println("Enemy Menang!")
    } else {
        println("Tidak ada pemenang.")
    }
}
