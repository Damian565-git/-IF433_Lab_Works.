package oop_139507_Damian.Tugas_week07

// Regular class - tidak punya fungsi equals(), hashCode(), toString() otomatis
class RegularUser(val name: String, val age: Int)

// Data class - otomatis memiliki equals(), hashCode(), toString(), copy()
data class DataUser(val name: String, val age: Int)