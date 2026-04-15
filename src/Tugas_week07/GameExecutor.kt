package oop_139507_Damian.Tugas_week07

// Fungsi untuk memproses event battle - harus exhaustive
fun processEvent(event: BattleState) {
    val message = when (event) {
        is BattleState.SafeZone -> {
            "🏰 Memasuki Safe Zone - Area aman, tidak ada monster!"
        }

        is BattleState.MonsterEncounter -> {
            "⚔️ MONSTER ENCOUNTER! Bertemu dengan ${event.monsterName}! Siapkan senjatamu!"
        }

        is BattleState.LootDropped -> {
            "🎁 LOOT DROPPED! Mendapatkan item: ${event.item.name} (Damage: ${event.item.damage}, Rarity: ${event.item.rarity})"
        }

        is BattleState.GameOver -> {
            "💀 GAME OVER! ${event.reason}"
        }
    }

    println(message)
}