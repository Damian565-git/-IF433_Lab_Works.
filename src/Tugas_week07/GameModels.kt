package oop_139507_Damian.Tugas_week07

// Enum dengan properti custom
enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(20),
    RARE(7),
    EPIC(2),
    LEGENDARY(1)
}
// Data class untuk item game
data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)