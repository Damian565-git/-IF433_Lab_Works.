package oop_139507_Damian.Tugasweek14

// CHECKPOINT 3: UserValidator - hanya untuk validasi
class UserValidator {
    fun validate(user: User): Boolean = user.email.contains("@") && user.age >= 18
}

// CHECKPOINT 3: UserRepository - hanya untuk database
class UserRepository {
    fun save(user: User) {
        println("Saving user: ${user.name} to Database")
    }
}

// CHECKPOINT 4: EmailService - hanya untuk email
class EmailService {
    fun sendWelcome(user: User) {
        println("Welcome email -> ${user.email}")
    }
}

// Class coordinator yang bersih
class CleanUserManager(
    private val validator: UserValidator,
    private val repository: UserRepository,
    private val emailService: EmailService
) {
    fun processUser(user: User) {
        if (validator.validate(user)) {
            repository.save(user)
            emailService.sendWelcome(user)
        } else {
            println("User ${user.name} tidak valid!")
        }
    }
}

fun main() {
    val user = User("John Doe", "john@example.com", 20)
    val validator = UserValidator()
    val repository = UserRepository()
    val emailService = EmailService()
    val userManager = CleanUserManager(validator, repository, emailService)

    userManager.processUser(user)
}