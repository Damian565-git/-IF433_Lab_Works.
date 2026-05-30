package oop_139507_Damian.week14

class khs_mahasiswa {
    fun hitung_tugas(quiz: Double, tugasHarian: Double): Double {
        return (quiz * 0.3) + (tugasHarian * 0.7)
    }

    fun hitung_na(tugasMhs: Double, utsMhs: Double, uasMhs: Double, jenisKur: kurikulum_kampus): Double {
        return jenisKur.bobot_nilai(utsMhs, uasMhs, tugasMhs)
    }
}

interface kurikulum_kampus {
    fun bobot_nilai(uts: Double, uas: Double, tugas: Double): Double
}

class kur_merdeka : kurikulum_kampus {
    override fun bobot_nilai(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.3) + (uas * 0.4) + (tugas * 0.3)
    }
}

class kur_2013 : kurikulum_kampus {
    override fun bobot_nilai(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.2) + (uas * 0.3) + (tugas * 0.5)
    }
}

class khs_db {
    // Perbaikan: Nama parameter ketiga diubah dari 'na' menjadi 'naMhs' agar cocok dengan main()
    fun simpan_nilai(nim: String, nama: String, naMhs: Double): String {
        return "Nilai $nama ($nim) dengan NA $naMhs berhasil disimpan"
    }

    fun load_nilai(nim: String): String {
        return "Load nilai si $nim berhasil"
    }
}

fun main() {
    val khsMhs = khs_mahasiswa()
    val tugasMhs = khsMhs.hitung_tugas(quiz = 83.5, tugasHarian = 90.78)

    // Sekarang pemanggilan ini sudah aman dan tidak eror
    val naMhs1 = khsMhs.hitung_na(tugasMhs, utsMhs = 70.56, uasMhs = 68.77, jenisKur = kur_merdeka())
    val naMhs2 = khsMhs.hitung_na(tugasMhs, utsMhs = 70.56, uasMhs = 68.77, jenisKur = kur_2013())

    val kshDB = khs_db()
    val statSimpan1 = kshDB.simpan_nilai(nim = "123", nama = "Luffy", naMhs = naMhs1)
    val statSimpan2 = kshDB.simpan_nilai(nim = "234", nama = "Robin", naMhs = naMhs2)

    println(statSimpan1)
    println(statSimpan2)
}