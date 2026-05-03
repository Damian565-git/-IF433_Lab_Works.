package oop_139507_Damian.Tugas_week09

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")
    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    println("\n=== TEST GENERIC FUNCTIONS ===")
    printData(3.14159)
    printData("Hello Generic World")

    val processedDouble = processData(99.99)
    val processedString = processData("Kotlin is awesome")
    println("Processed double: $processedDouble")
    println("Processed string: $processedString")
}