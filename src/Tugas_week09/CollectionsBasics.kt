package oop_139507_Damian.Tugas_week09

fun main() {
    println("== TEST LIST ==")

    // Immutable List (Read-only)
    val readOnlyNumbers = listOf(10, 20, 30, 40, 50)
    println("Read-only list: $readOnlyNumbers")
    println("Size: ${readOnlyNumbers.size}")
    println("Element at index 2: ${readOnlyNumbers[2]}")

    // Mutable List (Dapat diubah)
    val mutableNumbers = mutableListOf(1, 2, 3, 4, 5)
    println("\nMutable list awal: $mutableNumbers")

    mutableNumbers.add(6)
    mutableNumbers.addAll(listOf(7, 8))
    mutableNumbers.removeAt(0)
    mutableNumbers[2] = 99

    println("Mutable list setelah perubahan: $mutableNumbers")

    // CHECKPOINT 1 sudah selesai

    println("\n== TEST SET ==")

    // Set otomatis menghilangkan duplikat
    val duplicateNumbers = listOf(1, 2, 2, 3, 3, 3, 4, 5, 5)
    println("List dengan duplikat: $duplicateNumbers")

    val uniqueSet = duplicateNumbers.toSet()
    println("Set (tanpa duplikat): $uniqueSet")

    val mutableSet = mutableSetOf("Apple", "Banana", "Apple", "Orange")
    println("MutableSet awal: $mutableSet")

    mutableSet.add("Grape")
    mutableSet.add("Banana") // Tidak akan ditambahkan karena sudah ada
    println("MutableSet setelah tambah: $mutableSet")
}