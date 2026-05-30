package oop_139507_Damian.Tugasweek14

// CHECKPOINT 16: Database abstraction
interface Database {
    fun query(sql: String): List<String>
}

// CHECKPOINT 16: Implementasi konkret
class PostgresDatabase : Database {
    override fun query(sql: String): List<String> = listOf("pg_data1", "pg_data2")
}

class MySQLDatabaseV2 : Database {
    override fun query(sql: String): List<String> = listOf("mysql_data1", "mysql_data2")
}

class MongoDatabase : Database {
    override fun query(sql: String): List<String> = listOf("mongo_doc1", "mongo_doc2")
}

// CHECKPOINT 17: Dependency Injection via constructor
class SafeUserService(private val db: Database) {
    fun getUser(id: Int): List<String> {
        return db.query("SELECT * FROM users WHERE id=$id")
    }
}

fun main() {
    // Mudah mengganti database!
    val postgresService = SafeUserService(PostgresDatabase())
    val mysqlService = SafeUserService(MySQLDatabaseV2())
    val mongoService = SafeUserService(MongoDatabase())

    println("Postgres: ${postgresService.getUser(1)}")
    println("MySQL: ${mysqlService.getUser(2)}")
    println("MongoDB: ${mongoService.getUser(3)}")
}