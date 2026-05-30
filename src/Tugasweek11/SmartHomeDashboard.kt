package oop_139507_Damian.Tugasweek11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
}
val lampu = SmartDevice("Philips WiZ Living Room", "Lighting", true, 12).apply {
    // setup sudah lengkap di constructor
}.also {
    homeDevices.add(it)
}
val kamera = SmartDevice("Ezviz Outdoor", "Camera").apply {
    isOnline = true
    powerLoad = 5
}.also {
    println("(LOG) Kamera terhubung")
    homeDevices.add(it)
}
val ac = run {
    SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
}
homeDevices.add(ac)

val feeder = SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
homeDevices.add(feeder)
val searchResult = homeDevices.find { it.category == "Camera" }
searchResult?.let {
    println(it.diagnose())
}
with(homeDevices) {
    println("Jumlah perangkat: ${this.size}")
}
val totalPower = homeDevices.run {
    sumOf { it.powerLoad }
}
println("Total daya: $totalPower Watt")