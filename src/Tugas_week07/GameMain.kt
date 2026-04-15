package oop_139507_Damian.Tugas_week07

fun main() {
    println("=" .repeat(50))
    println("🎮 RPG GAME ENGINE DEMO 🎮")
    println("=" .repeat(50))

    // 1. Test Singleton GameManager
    println("\n📌 TEST GAME MANAGER SINGLETON")
    println("-".repeat(30))
    GameManager.startGame()  // Pertama kali - akan start
    GameManager.startGame()  // Kedua kali - akan menolak karena sudah berjalan

    // 2. Test Enum - Drop Chance
    println("\n📌 TEST ITEM RARITY DROP CHANCE")
    println("-".repeat(30))
    println("Legendary Item Drop Chance: ${ItemRarity.LEGENDARY.dropChance}%")
    println("Common Item Drop Chance: ${ItemRarity.COMMON.dropChance}%")

    // 3. Test Factory Pattern
    println("\n📌 TEST WEAPON FACTORY")
    println("-".repeat(30))
    val starterWeapon = Weapon.forgeStarterSword()
    starterWeapon.displayWeapon()

    println()
    val epicWeapon = Weapon.forgeEpicSword()
    epicWeapon.displayWeapon()

    // 4. Test Immutability dengan copy()
    println("\n📌 TEST IMMUTABILITY - UPGRADE WEAPON")
    println("-".repeat(30))
    val upgradedItem = starterWeapon.item.copy(
        name = "Pedang Kayu +1",
        damage = 25
    )
    println("Original weapon: ${starterWeapon.item.name} (Damage: ${starterWeapon.item.damage})")
    println("Upgraded weapon: ${upgradedItem.name} (Damage: ${upgradedItem.damage})")

    // 5. Test Sealed Class Event Dispatch
    println("\n📌 TEST BATTLE EVENT DISPATCH")
    println("-".repeat(30))

    val events = listOf(
        BattleState.SafeZone,
        BattleState.MonsterEncounter("Goblin Nakal"),
        BattleState.LootDropped(upgradedItem),
        BattleState.GameOver("Terkena jebakan racun")
    )

    events.forEach { event ->
        processEvent(event)
    }

    // 6. Test Game Stop
    println("\n📌 GAME STATUS")
    println("-".repeat(30))
    println("Game Running: ${GameManager.isGameRunning}")
    GameManager.stopGame()
    println("Game Running: ${GameManager.isGameRunning}")

    println("\n" + "=" .repeat(50))
    println("🎮 DEMO SELESAI 🎮")
    println("=" .repeat(50))
}