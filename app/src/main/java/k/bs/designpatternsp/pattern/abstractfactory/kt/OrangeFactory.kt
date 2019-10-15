package k.bs.designpatternsp.pattern.abstractfactory.kt

class OrangeFactory : PlantFactory() {
    override fun makePlant(): Plant = OrangePlant()
}