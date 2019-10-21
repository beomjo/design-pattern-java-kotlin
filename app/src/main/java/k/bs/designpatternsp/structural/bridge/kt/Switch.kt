package k.bs.designpatternsp.structural.bridge.kt

interface Switch {
    var appliance: Appliance
    fun turnOn()
}