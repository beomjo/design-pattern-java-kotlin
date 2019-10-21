package k.bs.designpatternsp.creational.abstractfactory.kt

class OrangeFactory : PlantFactory() {
    override fun makePlant(): Plant = OrangePlant()
}