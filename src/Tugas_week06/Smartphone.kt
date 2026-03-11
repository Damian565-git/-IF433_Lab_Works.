package oop_139507_Damian.Tugas_week06

class Smartphone : Camera, Phone {

    // Manual override untuk resolve ambiguity
    override fun turnOn() {
        super<Camera>.turnOn()  // Menjalankan logika Camera
        super<Phone>.turnOn()   // Menjalankan logika Phone
        println("Sistem operasi Smartphone berhasil booting.")
    }

    // Method spesifik Smartphone
    fun installApp(appName: String) {
        println("Menginstall $appName dari Play Store...")
    }
}