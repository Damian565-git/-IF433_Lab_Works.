package oop_139507_Damian.Tugasweek14

// CHECKPOINT 10: Shape interface sebagai abstraksi
interface Shape {
    fun area(): Int
}

// CHECKPOINT 11: Rectangle implementasi sendiri
class SafeRectangle(var width: Int, var height: Int) : Shape {
    override fun area() = width * height
}

// CHECKPOINT 11: Square implementasi sendiri
class SafeSquare(var side: Int) : Shape {
    override fun area() = side * side
}

fun printArea(shape: Shape) {
    println("Area: ${shape.area()}")
}

fun main() {
    val rectangle = SafeRectangle(5, 4)
    val square = SafeSquare(4)

    println("Rectangle (5x4):")
    printArea(rectangle) // Output: 20 ✅

    println("\nSquare (4x4):")
    printArea(square) // Output: 16 ✅
}