package k.bs.designpatternsp.pattern.factorymethod.kt

sealed class Country {
    object USA : Country() //Kotlin 1.0 could only be an inner class or object
    data class Canada(val someProperty: String) : Country() //Kotlin 1.1 data class extends other class
    object Spain : Country() //Kotlin 1.1 declared as top level class/object in the same file
    class Greece(val someProperty: String) : Country()
}