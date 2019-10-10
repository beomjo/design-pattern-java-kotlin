package k.bs.designpatternsp.pattern.bridge.kt

interface Switch {
    var appliance: Appliance
    fun turnOn()
}