package k.bs.designpatternsp.creational.prototype.kt

interface Vehicle : Cloneable {
    fun createClone(): Vehicle
}