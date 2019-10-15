package k.bs.designpatternsp.pattern.composite.kt.computer

open class Composite(name: String) : Equipment(0, name) {

    private val equipments = ArrayList<Equipment>()

    override val price: Int
        get() = equipments.map { it.price }.sum()


    fun add(equipment: Equipment) =
        apply { equipments.add(equipment) }
}