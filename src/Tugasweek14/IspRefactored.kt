package oop_139507_Damian.Tugasweek14

// CHECKPOINT 13: Interface yang terpisah dan spesifik
interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String): String
}

interface Faxable {
    fun fax(doc: String)
}

// CHECKPOINT 14: SimplePrinter hanya implement yang dibutuhkan
class ModernSimplePrinter : Printable {
    override fun print(doc: String) = println("Printing securely: $doc")
}

// AdvancedPrinter bisa implement semua
class AdvancedPrinter : Printable, Scannable, Faxable {
    override fun print(doc: String) = println("Advanced printing: $doc")
    override fun scan(doc: String): String = "Scanned content from $doc"
    override fun fax(doc: String) = println("Faxing: $doc")
}

fun main() {
    val printer = ModernSimplePrinter()
    printer.print("Report.pdf")

    println("\n--- Advanced Printer ---")
    val advanced = AdvancedPrinter()
    advanced.print("Contract.pdf")
    println(advanced.scan("Image.jpg"))
    advanced.fax("Invoice.pdf")
}