package oop_139507_Damian.Tugas_week06

fun main() {
    println("🏠 SMART HOME SYSTEM - INITIALIZING...")
    println("========================================")

    // 1. Instansiasi semua smart devices
    println("\n📦 CREATING SMART DEVICES:")
    println("-------------------------")
    val lampuRuangTamu = SmartLamp("LMP001", "Lampu Ruang Tamu")
    val speakerDapur = SmartSpeaker("SPK002", "Google Nest Dapur")
    val cctvGarasi = SmartCCTV("CTV003", "Ezviz Garasi")

    // 2. Buat SmartHomeHub dan tambahkan devices
    println("\n🏭 SETTING UP SMART HOME HUB:")
    println("-----------------------------")
    val hub = SmartHomeHub()

    hub.addDevice(lampuRuangTamu)
    hub.addDevice(speakerDapur)
    hub.addDevice(cctvGarasi)

    // 3. List semua devices
    hub.listAllDevices()

    // 4. Tes masing-masing device secara individual
    println("\n🔧 TESTING INDIVIDUAL DEVICES:")
    println("-------------------------------")

    println("\n--- Testing SmartLamp ---")
    lampuRuangTamu.turnOn()
    lampuRuangTamu.setBrightness(75)
    lampuRuangTamu.turnOff()

    println("\n--- Testing SmartSpeaker ---")
    speakerDapur.turnOn()
    speakerDapur.playMusic("Shape of You - Ed Sheeran")
    speakerDapur.askWeather()
    speakerDapur.turnOff()

    println("\n--- Testing SmartCCTV ---")
    cctvGarasi.turnOn()
    cctvGarasi.getLiveFeed()
    cctvGarasi.detectMotion()
    cctvGarasi.stopRecord()
    cctvGarasi.turnOff()

    // 5. Tes mode keamanan
    println("\n🔐 TESTING SECURITY MODE:")
    println("-------------------------")
    // Nyalakan beberapa device dulu
    lampuRuangTamu.turnOn()
    speakerDapur.turnOn()
    cctvGarasi.turnOn()

    // Aktifkan mode keamanan
    hub.activateSecurityMode()

    // 6. Tes mematikan semua switch
    hub.turnOffAllSwitches()

    // 7. Tes pencarian device
    println("\n🔍 TESTING DEVICE SEARCH:")
    println("-------------------------")
    val foundDevice = hub.getDeviceById("SPK002")
    println("Device found: ${foundDevice?.getInfo() ?: "Not found"}")

    val switchableDevices = hub.getDevicesByType(Switchable::class.java)
    println("Jumlah switchable devices: ${switchableDevices.size}")

    val recordableDevices = hub.getDevicesByType(Recordable::class.java)
    println("Jumlah recordable devices: ${recordableDevices.size}")

    // 8. Simulasi skenario rumah pintar
    println("\n🏡 SMART HOME SIMULATION:")
    println("-------------------------")
    println("Skenario: Malam hari, semua perangkat aktif...")

    // Nyalakan semua device
    lampuRuangTamu.turnOn()
    speakerDapur.turnOn()
    cctvGarasi.turnOn()

    println("\nSkenario: Ada gerakan mencurigakan di garasi...")
    cctvGarasi.detectMotion()

    println("\nSkenario: Pengguna pulang dan mematikan semua device...")
    hub.turnOffAllSwitches()

    println("\n✅ SMART HOME SYSTEM TEST COMPLETED SUCCESSFULLY!")
    println("================================================")
}