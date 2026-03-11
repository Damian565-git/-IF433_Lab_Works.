package oop_139507_Damian.Tugas_week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    private var isOn: Boolean = false
    private var currentVolume: Int = 50

    override fun turnOn() {
        isOn = true
        println("🔊 Speaker pintar $name ($id) dinyalakan - Google Assistant siap mendengarkan")
    }

    override fun turnOff() {
        isOn = false
        println("🔊 Speaker pintar $name ($id) dimatikan - Selamat tinggal!")
    }

    // Fungsi spesifik
    fun playMusic(song: String) {
        if (isOn) {
            println("🎵 Memutar lagu '$song' dari Spotify di speaker $name")
            println("   Volume: $currentVolume%")
        } else {
            println("🎵 Nyalakan speaker $name terlebih dahulu untuk memutar musik")
        }
    }

    fun setVolume(level: Int) {
        currentVolume = level.coerceIn(0..100)
        println("🔊 Volume speaker $name diatur ke $currentVolume%")
    }

    fun askWeather() {
        println("☀️ Cuaca hari ini: Cerah berawan, suhu 28°C")
    }
}