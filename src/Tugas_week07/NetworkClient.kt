package oop_139507_Damian.Tugas_week07

class NetworkClient private constructor(val url: String) {

    companion object {
        // Shared constant - seperti static final di Java
        const val BASE_URL = "https://api.umn.ac.id"

        // Factory method untuk membuat instance
        fun createClient(): NetworkClient {
            println("Membangun NetworkClient dengan BASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }

    fun connect() {
        println("Connecting to $url...")
    }
}