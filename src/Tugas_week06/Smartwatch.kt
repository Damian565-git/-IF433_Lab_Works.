package oop_139507_Damian.Tugas_week06

// Parent class ditulis pertama, baru interfaces dengan koma
class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {

    override val brand: String = "Samsung"

    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }

    override fun batteryStatus(): String {
        return "Battery: 75% remaining"
    }

    // Fungsi spesifik Smartwatch
    fun countSteps() {
        println("Menghitung langkah: 5.432 langkah hari ini")
    }
}