package oop_139507_Damian.Tugasweek14

import java.io.File

// ============================================
// BAD CODE - Awal (CHECKPOINT 18)
// ============================================

class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }
        println("Memproses pesanan $itemName seharga $finalPrice")
        file.appendText("$itemName,$finalPrice,$customerType\n")
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// ============================================
// REFACTORED CODE - SOLID Principles
// ============================================

// 1. SRP & DIP: Abstraksi OrderRepository
interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

// Implementasi CSV Repository (Safe resource handling)
class CsvOrderRepository(private val filePath: String = "orders.csv") : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        File(filePath).printWriter().use { writer ->
            writer.appendText("$itemName,$finalPrice,$customerType\n")
        }
        println("Order saved to CSV: $itemName")
    }
}

// 2. SRP & DIP: Abstraksi NotificationService
interface NotificationService {
    fun sendNotification(itemName: String, finalPrice: Double)
}

// Implementasi Email Notifier
class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String, finalPrice: Double) {
        println("📧 Email terkirim: Pesanan $itemName seharga $$finalPrice telah dikonfirmasi!")
    }
}

// 3. OCP: Abstraksi PricingStrategy
interface PricingStrategy {
    fun calculate(price: Double): Double
}

// Implementasi strategi diskon
class RegularPricing : PricingStrategy {
    override fun calculate(price: Double) = price
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double) = price * 0.90 // Diskon 10%
}

// Bisa ditambah diskon baru tanpa modifikasi class utama!
class PremiumPricing : PricingStrategy {
    override fun calculate(price: Double) = price * 0.80 // Diskon 20%
}

class EmployeePricing : PricingStrategy {
    override fun calculate(price: Double) = price * 0.85 // Diskon 15%
}

// 4. Clean OrderProcessor - Mengikuti semua prinsip SOLID
class SafeOrderProcessor(
    private val repository: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, pricingStrategy: PricingStrategy) {
        val finalPrice = pricingStrategy.calculate(basePrice)
        println("Memproses pesanan $itemName seharga $$finalPrice")
        repository.saveOrder(itemName, finalPrice, pricingStrategy::class.simpleName ?: "Unknown")
        notifier.sendNotification(itemName, finalPrice)
    }
}

// ============================================
// MAIN FUNCTION - Testing
// ============================================

fun main() {
    println("=" .repeat(60))
    println("🚀 E-COMMERCE ORDER PROCESSING SYSTEM")
    println("=" .repeat(60))

    // Setup dependencies
    val csvRepo = CsvOrderRepository("ecommerce_orders.csv")
    val emailNotifier = EmailNotifier()
    val orderProcessor = SafeOrderProcessor(csvRepo, emailNotifier)

    // Process orders dengan berbagai strategi harga
    println("\n📦 Processing Orders:")
    println("-".repeat(40))

    orderProcessor.processOrder("Laptop Gaming", 15000.0, RegularPricing())
    orderProcessor.processOrder("Smartphone Pro", 8000.0, VipPricing())
    orderProcessor.processOrder("Tablet Premium", 5000.0, PremiumPricing())
    orderProcessor.processOrder("Keyboard Mechanical", 750.0, EmployeePricing())

    println("\n" + "=" .repeat(60))
    println("📊 File I/O Summary:")
    println("=" .repeat(60))

    // Tampilkan isi file CSV
    val file = File("ecommerce_orders.csv")
    if (file.exists()) {
        println("Content of ${file.absolutePath}:")
        file.readLines().forEachIndexed { index, line ->
            println("  ${index + 1}. $line")
        }
    }

    println("\n" + "=" .repeat(60))
    println("✅ SOLID Principles Applied:")
    println("   • SRP: Repository, Notifier, Pricing terpisah")
    println("   • OCP: Bisa tambah diskon baru tanpa modifikasi processor")
    println("   • DIP: Processor tergantung abstraksi, bukan konkret")
    println("   • Safe File I/O: Menggunakan use block")
    println("=" .repeat(60))
}