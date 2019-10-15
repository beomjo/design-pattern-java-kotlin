package k.bs.designpatternsp.pattern.abstractfactory.kt

class AppleFactory : PlantFactory() {
    override fun makePlant(): Plant = ApplePlant()
}