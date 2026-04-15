package oop_139507_Damian.Tugas_week07

// Class dengan private constructor - tidak bisa diinstansiasi langsung
class Weapon private constructor(
    val item: GameItem,
    val durability: Int
) {
    companion object {
        // Factory method untuk membuat senjata starter
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem(
                name = "Pedang Kayu Bapuk",
                damage = 5,
                rarity = ItemRarity.COMMON
            )
            println("Membuat senjata starter: ${starterItem.name} (Damage: ${starterItem.damage}, Rarity: ${starterItem.rarity})")
            return Weapon(starterItem, 50)
        }

        // Factory method untuk membuat senjata epic
        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem(
                name = "Excalibur",
                damage = 45,
                rarity = ItemRarity.EPIC
            )
            println("Membuat senjata epic: ${epicItem.name} (Damage: ${epicItem.damage}, Rarity: ${epicItem.rarity})")
            return Weapon(epicItem, 100)
        }
    }
    fun displayWeapon() {
        println("=== WEAPON INFO ===")
        println("Nama: ${item.name}")
        println("Damage: ${item.damage}")
        println("Rarity: ${item.rarity} (Drop Chance: ${item.rarity.dropChance}%)")
        println("Durability: $durability")
    }
}