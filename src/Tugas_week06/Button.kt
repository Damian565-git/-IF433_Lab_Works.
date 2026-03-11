package oop_139507_Damian.Tugas_week06

class Button : Clickable {
    override fun click() {
        println("Tombol diklik: melakukan aksi tertentu...")
    }

    // Bisa override default method jika perlu
    override fun showOff() {
        println("Button: Saya adalah tombol yang bisa diklik!")
    }
}