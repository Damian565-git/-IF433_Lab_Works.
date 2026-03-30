package oop_139507_Damian.Tugas_week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()  // Instansiasi lewat Factory
    client.connect()
}
println("\n=== TEST REGULAR CLASS ===")
val reg1 = RegularUser("Alice", 22)
val reg2 = RegularUser("Alice", 22)
println(reg1)  // Akan mencetak alamat memori seperti: RegularUser@1a2b3c4d
println("Sama? ${reg1 == reg2}")  // False - meskipun isi sama