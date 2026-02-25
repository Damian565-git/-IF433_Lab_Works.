package oop_139507_Damian.Tugas_week04

fun main() {
    println("========== TESTING GUIDED LAB ==========")

    println("\n--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()      // Memanggil method milik sendiri
    myCar.honk()           // Memanggil method yang sudah di-override
    myCar.accelerate()     // Memanggil gabungan method Parent dan Child

    println("\n========== TESTING TUGAS MANDIRI 1 ==========")
    println("\n--- Testing ElectricCar ---")
    val electricCar = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    electricCar.openTrunk()   // Method dari Car
    electricCar.honk()        // Method override dari Car
    electricCar.accelerate()  // Method final override dari ElectricCar

    println("\n========== TESTING TUGAS MANDIRI 2 ==========")
    println("\n--- Testing Manager ---")
    val manager = Manager(name = "Budi", baseSalary = 10000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println("\n--- Testing Developer ---")
    val developer = Developer(
        name = "Ani",
        baseSalary = 8000000,
        programmingLanguage = "Kotlin"
    )
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}