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
println("Sama? ${reg1 == reg2}") // False - meskipun isi sama

println("\n=== TEST DATA CLASS ===")
val data1 = DataUser("Alice", 22)
val data2 = DataUser("Alice", 22)
println(data1)  // Output: DataUser(name=Alice, age=22) - readable format
println("Sama? ${data1 == data2}")  // True - structural equality

// copy() - membuat salinan dengan modifikasi tanpa mengubah objek asli
val data3 = data1.copy(age = 23)
println("Hasil Copy: $data3")

// Destructuring Declaration - memecah objek menjadi variabel
val (userName, userAge) = data1
println("Destructured: $userName berumur $userAge")

println("\n=== TEST SEALED CLASS ===")
val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

// ERROR: 'when' expression must be exhaustive
val uiMessage = when(response) {
    is ApiResponse.Success -> "Tampilkan: ${response.data}"
    is ApiResponse.Error -> "Munculkan alert: ${response.message}"
    // Loading tidak ditangani -> ERROR!
}