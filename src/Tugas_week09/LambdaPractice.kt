package oop_139507_Damian.Tugas_week09

fun main() {
    println("== TEST LAMBDA ==")

    // Syntax Lambda eksplisit: { parameters -> body }
    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(5, 10)}")

    // Lambda dengan satu parameter bisa menggunakan implicit 'it'
    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")

    // Lambda dengan tipe lebih kompleks
    val multiplyAndAdd: (Int, Int, Int) -> Int = { x, y, z -> (x * y) + z }
    println("Multiply and add (3 * 4) + 5 = ${multiplyAndAdd(3, 4, 5)}")

    // Lambda sebagai parameter fungsi
    fun operateOnNumber(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    val result = operateOnNumber(7, 3) { x, y -> x - y }
    println("Hasil operate (7 - 3) = $result")
}