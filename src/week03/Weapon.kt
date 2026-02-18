package oop_139507_Damian.week03

package oop_139507_Damian.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    println(" PERINGATAN: Damage tidak boleh negatif! ($value)")
                    println("   Menggunakan nilai lama: $field")
                }
                value > 1000 -> {
                    println(" PERINGATAN: Damage terlalu tinggi (>1000), dipaksa menjadi 1000")
                    field = 1000
                }
                else -> {
                    field = value
                    println("✓ Damage $name diupdate menjadi $value")
                }
            }
        }

    val tier: String
        get() {
            return when {
                damage > 800 -> "LEGENDARY "
                damage > 500 -> "EPIC "
                else -> "COMMON "
            }
        }

    fun displayInfo() {
        println("""
            ===== WEAPON INFO =====
            Name: $name
            Damage: $damage
            Tier: $tier
            =======================
        """.trimIndent())
    }
}

fun main() {
    println(" TESTING WEAPON (TUGAS 1) ")

    val sword = Weapon("Excalibur")
    val bow = Weapon("Longbow of Wisdom")

    println("\n Testing Weapon 1: ${sword.name}")
    sword.displayInfo()

    println("\n   Mencoba set damage = -50 (harus ditolak)")
    sword.damage = -50
    println("   ➡ Damage sekarang: ${sword.damage}, Tier: ${sword.tier}")

    println("\n   Mencoba set damage = 9999 (dipaksa jadi 1000)")
    sword.damage = 9999
    println("   ➡ Damage sekarang: ${sword.damage}, Tier: ${sword.tier}")

    println("\n   Mencoba set damage = 750")
    sword.damage = 750
    println("   ➡ Damage sekarang: ${sword.damage}, Tier: ${sword.tier}")

    println("\n Testing Weapon 2: ${bow.name}")
    println("   Mencoba set damage = 850")
    bow.damage = 850
    bow.displayInfo()
}