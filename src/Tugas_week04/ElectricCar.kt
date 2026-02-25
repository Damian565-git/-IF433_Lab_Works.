package oop_139507_Damian.Tugas_week04


// ElectricCar merupakan child dari Car
class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int)
    : Car(brand, numberOfDoors) {

    // Menggunakan final override agar tidak bisa di-override lagi oleh turunan berikutnya
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }

    // Tidak perlu override honk() karena akan menggunakan implementasi dari Car
    // Tidak perlu override openTrunk() karena akan menggunakan implementasi dari Car
}