package oop_139507_Damian.week06

interface Bekerja {

    val namaKerjaan: String
    val gaji: Int
    val jmlHari: Int

    val gajiDidapat: Int
        get() = gaji * jmlHari

    fun ngoding()

    fun tester() {
        println("Testing Program")
    }
}