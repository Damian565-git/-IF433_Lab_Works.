package oop_139507_Damian.Tugasweek14

// LSP Violation: Rectangle sebagai parent
open class Rectangle(var width: Int, var height: Int) {
    open fun setWidth(width: Int) { this.width = width }
    open fun setHeight(height: Int) { this.height = height }
    fun area(): Int = width * height
}

// Square memaksa perubahan behavior
class Square : Rectangle(0, 0) {
    override fun setWidth(width: Int) {
        super.setWidth(width)
        super.setHeight(width)
    }

    override fun setHeight(height: Int) {
        super.setWidth(height)
        super.setHeight(height)
    }
}

fun testRectangleArea(rect: Rectangle) {
    rect.setWidth(5)
    rect.setHeight(4)
    // EXPECTED: 5 * 4 = 20
    // Jika rect adalah Square: 4 * 4 = 16 (FAIL!)
    println("Area: ${rect.area()}")
}

fun main() {
    println("Testing Rectangle:")
    testRectangleArea(Rectangle(0, 0))

    println("\nTesting Square (LSP Violation):")
    testRectangleArea(Square()) // Hasilnya salah!
}