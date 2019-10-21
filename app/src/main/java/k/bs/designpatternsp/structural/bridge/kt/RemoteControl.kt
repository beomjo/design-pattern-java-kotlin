package k.bs.designpatternsp.structural.bridge.kt

class RemoteControl(override var appliance: Appliance) : Switch {
    override fun turnOn() = appliance.run()
}