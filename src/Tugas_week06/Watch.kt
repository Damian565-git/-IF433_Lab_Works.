package oop_139507_Damian.Tugas_week06

// Abstract class = Is-A relationship
abstract class Watch {
    // Abstract property
    abstract val brand: String

    // Abstract method
    abstract fun showTime()

    // Concrete method
    fun setAlarm(time: String) {
        println("Alarm disetel pada jam $time")
    }
}