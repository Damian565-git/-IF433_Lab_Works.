package oop_139507_Damian.Tugas_week09

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> = items.toList()

    // Fungsi pencarian untuk Coin berdasarkan nama
    fun findByName(name: String): List<T> where T : Coin {
        return items.filter { it.name == name }
    }

    // Fungsi pencarian generik dengan predicate
    fun find(predicate: (T) -> Boolean): List<T> {
        return items.filter(predicate)
    }
}

