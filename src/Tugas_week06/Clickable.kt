interface Clickable {
    // ERROR: Property in an interface cannot have a backing field
    // val name: String = "Tombol Rahasia" // Ini akan menyebabkan compiler error

    // Function without body (Implicitly Abstract)
    fun click()

    // Function with body (Default method di Kotlin)
    fun showOff() {
        println("Saya bisa diklik!")
    }
}