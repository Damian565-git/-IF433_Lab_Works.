package oop_139507_Damian.Tugas_week06

class SmartHomeHub {
    // Menyimpan semua smart devices
    private val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("✅ Device ${device.name} ditambahkan ke hub")
    }

    fun removeDevice(deviceId: String) {
        val iterator = devices.iterator()
        while (iterator.hasNext()) {
            val device = iterator.next()
            if (device.id == deviceId) {
                iterator.remove()
                println("❌ Device ${device.name} dihapus dari hub")
                return
            }
        }
        println("⚠️ Device dengan ID $deviceId tidak ditemukan")
    }

    fun listAllDevices() {
        println("\n=== DAFTAR SEMUA DEVICE ===")
        if (devices.isEmpty()) {
            println("Tidak ada device terdaftar")
        } else {
            devices.forEachIndexed { index, device ->
                println("${index + 1}. ${device.getInfo()}")
            }
        }
    }

    fun turnOffAllSwitches() {
        println("\n=== MEMATIKAN SEMUA SWITCHABLE DEVICES ===")
        var count = 0
        devices.forEach { device ->
            // Smart Casting dengan 'is'
            if (device is Switchable) {
                println("Mematikan: ${device.name}")
                device.turnOff()
                count++
            }
        }
        println("✅ $count switchable devices telah dimatikan")
    }

    fun activateSecurityMode() {
        println("\n=== MODUS KEAMANAN DIAKTIFKAN ===")
        println("⚠️ Semua perangkat recordable mulai merekam!")

        devices.forEach { device ->
            // Smart casting untuk Recordable
            if (device is Recordable) {
                println("📹 ${device.name}: Memulai perekaman keamanan")
                device.startRecord()
            }

            // Smart casting untuk SmartSpeaker
            if (device is SmartSpeaker) {
                println("🔊 ${device.name}: Memainkan sirine peringatan")
                device.playMusic("Sirine Peringatan - Alarm Keamanan")
                device.setVolume(80)
            }
        }
    }

    fun getDeviceById(id: String): SmartDevice? {
        return devices.find { it.id == id }
    }

    fun getDevicesByType(type: Class<*>): List<SmartDevice> {
        return devices.filter { type.isInstance(it) }
    }
}