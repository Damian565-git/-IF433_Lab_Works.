package oop_139507_Damian.Tugasweek12

fun divide(a: Int, b: Int): Int {
    return a / b
}
fun main() {
    println("=== TEST TRY AS EXPRESSION ===")
    val inputString = "123A"
    // try langsung mengembalikan hasil parsing, atau -1 jika gagal
    val result: Int = try {
        Integer.parseInt(inputString)
    } catch (e: NumberFormatException) {
        -1
    }
    println("Hasil parsing: $result")
}