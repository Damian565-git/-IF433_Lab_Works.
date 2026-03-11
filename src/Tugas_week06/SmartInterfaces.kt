package oop_139507_Damian.Tugas_week06

// Interface dasar untuk semua smart device
interface SmartDevice {
    val id: String
    val name: String

    fun getInfo(): String {
        return "Device[$id]: $name"
    }
}

// Kemampuan untuk dinyalakan/dimatikan
interface Switchable {
    fun turnOn()
    fun turnOff()
}

// Kemampuan untuk merekam
interface Recordable {
    fun startRecord()

    // Default method
    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}