package oop_139507_Damian.Tugas_week09

fun <T> printData(data: T) {
    println("Data yang diterima: $data")
}

fun <T> processData(input: T): T {
    return input
}

fun <T> getMax(a: T, b: T): T where T : Comparable<T> {
    return if (a > b) a else b
}