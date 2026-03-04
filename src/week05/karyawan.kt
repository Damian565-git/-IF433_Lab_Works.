package oop_139507_Damian.week05

abstract class Karyawan {
    val nama: String = "Budi"
    abstract fun bekerja(kecepatan: Int): String

    fun terima_gaji() {
        println("hore gajian!")
    }
}

class Staff : Karyawan() {
    override fun bekerja(kecepatan: Int): String {
        return "Staff ngetik, kecepatan $kecepatan"
    }

    fun pegang_uang() {
        println("staff pegang uang")
    }
}

class Manager : Karyawan() {
    override fun bekerja(kecepatan: Int): String {
        return "Manager mengawasi $kecepatan km/jam"
    }

    fun Quality_control() {
        println("Manager melakukan Quality control")
    }
}

fun main() {
    var listKry: List<Karyawan> = listOf(
        Staff(),
        Manager()
    )

    println("jenis karyawan ada " + listKry.size)

    for (kry in listKry) {
        println("kerjanya krywan: " + kry.bekerja(kecepatan = 3))

        if (kry is Staff) {
            println(kry.pegang_uang())
        } else if (kry is Manager) {
            println(kry.Quality_control())
        }

        when (kry) {
            is Staff -> {
                println("When staff: " + kry.pegang_uang())
            }
            is Manager -> {
                println("When manager: " + kry.Quality_control())
            }
        }
    }
}