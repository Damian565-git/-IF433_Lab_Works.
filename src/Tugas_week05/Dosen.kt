package oop_139507_Damian.Tugas_week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    //wajib di overide karena fungsi bekerja () bersifat abstract
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }
    // Fungid unik/spesifik yang hanya dimiliki Dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}