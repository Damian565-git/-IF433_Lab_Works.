package oop_139507_Damian.Tugas_week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("Original Data: $numbers")

    println("\n== HOF: FILTER ==")
    // filter() membuat list baru berisi elemen yang memenuhi kondisi (true)
    val evens = numbers.filter { it % 2 == 0 }
    println("Evens only: $evens")

    // CHECKPOINT 5

    println("\n== HOF: MAP ==")
    // map() merubah bentuk/nilai data, tapi ukurannya tetap sama
    val multiplied = evens.map { it * 10 }
    val asStrings = multiplied.map { "Rp $it" }
    println("Multiplied: $multiplied")
    println("Formatted: $asStrings")

    // CHECKPOINT 6

    println("\n== HOF: SORTING & FOREACH ==")
    val sortedDesc = numbers.sortedByDescending { it }
    println("Sorted descending: $sortedDesc")

    sortedDesc.forEach { element ->
        println("Element: $element")
    }

    // CHECKPOINT 7
}