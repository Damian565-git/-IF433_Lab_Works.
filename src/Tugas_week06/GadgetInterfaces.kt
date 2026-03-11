package oop_139507_Damian.Tugas_week06

interface Camera {
    fun turnOn() {
        println("Lensa kamera terbuka dan sensor aktif.")
    }

    fun takePhoto() {
        println("Mengambil foto...")
    }
}

interface Phone {
    fun turnOn() {
        println("Sinyal seluler mencari jaringan.")
    }

    fun makeCall(number: String) {
        println("Memanggil $number...")
    }
}