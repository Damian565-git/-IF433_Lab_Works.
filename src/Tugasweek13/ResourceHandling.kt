package oop_139507_Damian.Tugasweek13

package oop_001_johnthor.week13

import java.io.File
import java.io.PrintWriter

fun main() {
    val file = File("test_resource.txt")

    // Manual close (tanpa use)
    println("=== MANUAL CLOSE (Tidak Rekomendasi) ===")
    var writer: PrintWriter? = null
    try {
        writer = PrintWriter(file)
        writer.println("Line 1: Manual write")
        writer.println("Line 2: Harus ingat close")
        println("Manual write selesai")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    } finally {
        writer?.close()
        println("Stream ditutup manual")
    }

    // Dengan use block
    println("\n=== DENGAN use (Safe Handling) ===")
    PrintWriter(file).use { writer ->
        writer.println("Line 1: Safe write with use block")
        writer.println("Line 2: Auto close even if error")
        println("Safe write selesai, akan auto-close")
    }

    // BufferedReader untuk baca efisien
    println("\n=== TEST BUFFERED READER ===")
    file.bufferedReader().use { reader ->
        reader.lineSequence().take(5).forEach { line ->
            println("Stream Read: $line")
        }
    }
}