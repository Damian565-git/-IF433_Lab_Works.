package oop_139507_Damian.Tugasweek11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
}
val lampu = SmartDevice("Philips WiZ Living Room", "Lighting", true, 12).apply {
    // setup sudah lengkap di constructor
}.also {
    homeDevices.add(it)
}