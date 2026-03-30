package oop_139507_Damian.Tugas_week07

// Enum class - nilai yang sudah ditentukan dan tetap
enum class AppState {
    STARTING, RUNNING, STOPPED
}

// Sealed class - hierarki tertutup, setiap child bisa punya properti berbeda
sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}