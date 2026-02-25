package oop_139507_Damian.Tugas_week04


// Car "Is-A" Vehicle. Parameter brand dilempar ke atas melalui Vehicle(brand)
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    // Override method honk dari parent
    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    // Override method accelerate dengan memanggil super
    override fun accelerate() {
        super.accelerate() // Memanggil logika penambahan kecepatan milik Parent
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}