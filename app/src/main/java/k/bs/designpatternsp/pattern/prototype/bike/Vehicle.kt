package k.bs.designpatternsp.pattern.prototype.bike

interface Vehicle : Cloneable {
    fun createClone(): Vehicle
}