package oop_139507_Damian.week02

fun main() {

    val input = Scanner(System.`in`)

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
}

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