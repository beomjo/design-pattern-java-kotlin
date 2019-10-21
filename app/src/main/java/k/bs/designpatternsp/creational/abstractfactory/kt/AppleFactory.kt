package k.bs.designpatternsp.creational.abstractfactory.kt

class AppleFactory : PlantFactory() {
    override fun makePlant(): Plant = ApplePlant()
}