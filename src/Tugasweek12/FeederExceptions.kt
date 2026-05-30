package oop_139507_Damian.Tugasweek12

// Hierarchy Exception (Sealed Class)
sealed class FeederException(msg: String) : Exception(msg)

// Custom Exceptions Subclasses
class FoodEmptyException(requested: Int, available: Int) :
    FeederException("Kibble tidak cukup! Diminta $requested gr, sisa $available gr")

class DispenserJamException :
    FeederException("Wadah dispenser tersangkut/macet!")