package oop_139507_Damian.Tugasweek11

fun String.addGreeting(): String {
    return "Hello, $this!"
}

fun String.repeatTimes(times: Int): String {
    return this.repeat(times)
}
fun String?.isNullOrEmptyCustom(): Boolean { // 'this' bisa bernilai null, jadi harus ditangani
    return this == null || this.isEmpty()
}