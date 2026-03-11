package oop_139507_Damian.Tugas_week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    private var isRecording: Boolean = false
    private var isOn: Boolean = false

    override fun turnOn() {
        isOn = true
        println("📹 CCTV $name ($id) dinyalakan - Kamera mulai memantau")
        // Otomatis mulai merekam saat dinyalakan
        startRecord()
    }

    override fun turnOff() {
        if (isRecording) {
            stopRecord()
        }
        isOn = false
        println("📹 CCTV $name ($id) dimatikan - Pemantauan dihentikan")
    }

    override fun startRecord() {
        if (isOn) {
            isRecording = true
            println("📹 CCTV $name: Merekam video 4K dengan night vision")
            println("   Resolusi: 3840x2160, Frame Rate: 30fps")
        } else {
            println("📹 CCTV $name: Nyalakan dulu untuk memulai perekaman")
        }
    }

    override fun stopRecord() {
        if (isRecording) {
            isRecording = false
            println("📹 CCTV $name: Perekaman dihentikan")
            super.stopRecord() // Memanggil default method dari interface
        }
    }

    // Fungsi spesifik
    fun detectMotion() {
        println("📹 CCTV $name: Gerakan terdeteksi di area garasi!")
        if (isOn && !isRecording) {
            startRecord()
        }
    }

    fun getLiveFeed() {
        println("📹 Menampilkan live feed dari CCTV $name")
        println("   Kualitas: HD, Latency: <1s")
    }
}