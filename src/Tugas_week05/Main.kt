package oop_139507_Damian.Tugas_week05

fun main() {
    // Membuat polymorphic collection
    val daftarPegawai: List<Pegawai> = listOf(
        Dosen("Budi", "12345678"),
        Admin("Siti")
    )

    // Polymorphic behavior: memanggil method yang dioverride
    println("=== Semua Pegawai Bekerja ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
    }

    println("\n=== Smart Casting dengan 'is' ===")
    for (pegawai in daftarPegawai) {
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------------")
    }
}