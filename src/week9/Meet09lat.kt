package oop_139507_Damian.week9

fun main() {
    println("=========== LIST OF IMMUTABLE ===========")
    val arSiswa = listOf("Ali", "Budi", "Cica")
    println(arSiswa)
    println(arSiswa[1])
    println("Nama siswa: " + arSiswa[1])
    println("Banyak siswa: " + arSiswa.size)

    for (i in arSiswa) {
        println(i)
    }

    println("=========== LIST OF MUTABLE ===========")
    val arMatkul = mutableListOf("OOP", "Matdis", "GameDev")
    arMatkul.add("Kalkulus")
    arMatkul[2] = "Pemweb"
    arMatkul.remove("Matdis")
    println(arMatkul)

    println("=========== SET OF IMMUTABLE ===========")
    val arNilai = setOf(80, 90, 20, 30, 70, 10, 100)
    println("Apakah ada nilai 20? ${arNilai.contains(20)}")
    println(arNilai)

    println("=========== SET OF MUTABLE ===========")
    val arMakanan = mutableSetOf("Nasi Goreng", "Tempe", "Tahu", "Bakpao", "Ayam")
    arMakanan.add("Mie")
    arMakanan.remove("Tahu")
    arMakanan.add("Tempe")
    println(arMakanan)

    println("=========== MAP IMMUTABLE ===========")
    val arDataMhs = mapOf(
        "Acong" to 89,
        "Siska" to 90,
        "Udin" to 83
    )

    println("Banyak data: ${arDataMhs.size}")
    println("Si Acong nilainya: ${arDataMhs["Acong"]}")
    println("List Semua Mhs: ${arDataMhs.keys}")
    println("List Semua Nilai: ${arDataMhs.values}")
    println(arDataMhs)

    println("=========== MAP MUTABLE ===========")
    val arMenuResto = mutableMapOf(
        "Mie Ayam" to 5000,
        "Mie Bakso" to 6000,
        "Mie Pangsit" to 6500
    )

    arMenuResto["Mie Bakso"] = 6200
    arMenuResto.remove("Mie Ayam")
    println(arMenuResto)
}