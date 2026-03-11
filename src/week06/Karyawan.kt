package oop_139507_Damian.week06

class Karyawan(
    override val namaKerjaan: String,
    override val gaji: Int,
    override val jmlHari: Int,
    override val namaGame: String,
    override val waktuMain: Int
) : Bekerja, Bermain {

    override fun ngoding() {
        println("Kerjaan kamu $namaKerjaan")
        println("Gaji kamu $gajiDidapat")
    }

    override fun main_game() {
        println("Main $namaGame selama $waktuMain jam")
    }

    override fun tester() {
        super<Bekerja>.tester()
        super<Bermain>.tester()
    }
}