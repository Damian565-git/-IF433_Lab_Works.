package oop_139507_Damian.week8

fun sendNotification(user: UserProfile) {
    // Smart Casting: Kotlin compiler ingat pengecekan ini
    if (user.email != null) {
        println("Sending email to ${user.email}") // Otomatis di-cast ke String
    }

    // Alternatif dengan safe call
    user.email?.let {
        println("Alternative send to $it")
    }
}