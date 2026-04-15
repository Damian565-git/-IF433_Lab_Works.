package oop_139507_Damian.week8

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" } as String
        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" } as String
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = (rawJson["warranty"] as? Int) ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = (rawJson["size"] as? String) ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }
}

fun checkout(product: Product) {
    val transactionId = when (product) {
        is Electronic -> JavaPaymentService.processPayment(product.id)
        is Clothing -> JavaPaymentService.processPayment(product.id)
    }!!
    println("Transaction ID: $transactionId")
}
}