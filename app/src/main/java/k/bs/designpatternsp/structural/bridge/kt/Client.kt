package k.bs.designpatternsp.structural.bridge.kt

fun main() {
    var tvRemoteControl = RemoteControl(appliance = TV())
    tvRemoteControl.turnOn()
    var fancyVacuumCleanerRemoteControl = RemoteControl(appliance = VacuumCleaner())
    fancyVacuumCleanerRemoteControl.turnOn()
}