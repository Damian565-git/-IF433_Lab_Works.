package oop_139507_Damian.Tugas_week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    private var isOn: Boolean = false

    override fun turnOn() {
        isOn = true
        println("💡 Lampu $name ($id) dinyalakan - Cahaya terang menerangi ruangan")
    }

    override fun turnOff() {
        isOn = false
        println("💡 Lampu $name ($id) dimatikan - Ruangan menjadi gelap")
    }

    fun setBrightness(level: Int) {
        if (isOn) {
            println("💡 Lampu $name: kecerahan diatur ke $level%")
        } else {
            println("💡 Lampu $name: nyalakan dulu sebelum mengatur kecerahan")
        }
    }
}