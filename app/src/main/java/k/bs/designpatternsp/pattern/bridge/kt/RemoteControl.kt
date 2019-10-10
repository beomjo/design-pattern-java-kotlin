package k.bs.designpatternsp.pattern.bridge.kt

class RemoteControl(override var appliance: Appliance) : Switch {
    override fun turnOn() = appliance.run()
}