package oop_139507_Damian.Tugas_week06

// Interface = Can-Do relationship (kemampuan)
interface BluetoothConnectable {
    fun connectToBluetooth()

    // Default method
    fun disconnectBluetooth() {
        println("Bluetooth disconnected")
    }
}

interface Rechargeable {
    fun chargeBattery()

    // Default method
    fun batteryStatus(): String {
        return "Battery status: unknown"
    }
}