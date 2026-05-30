package oop_139507_Damian.Tugasweek14

// Fat interface - memaksa semua method
interface MultifunctionDevice {
    fun print(doc: String)
    fun scan(doc: String): String
    fun fax(doc: String)
}

// SimplePrinter dipaksa mengimplementasikan scan dan fax
class SimplePrinter : MultifunctionDevice {
    override fun print(doc: String) = println("Printing: $doc")
    override fun scan(doc: String) = throw UnsupportedOperationException("No scanner")
    override fun fax(doc: String) = throw UnsupportedOperationException("No fax")
}

fun main() {
    val printer = SimplePrinter()
    printer.print("Document.pdf")
    // printer.scan("Doc.pdf") // Akan throw exception!
}