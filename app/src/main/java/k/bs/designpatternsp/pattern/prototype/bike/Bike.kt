package k.bs.designpatternsp.pattern.prototype.bike

open class Bike(
    val model: String? = null,
    private val bikeType: String,
    private val gear: Int = 0
) : Vehicle {

    val someObject = hashMapOf<String, String>()

    override fun createClone(): Vehicle {
        return clone() as Bike
    }

    public override fun clone(): Any {
//        return super.clone() //Caused by: java.lang.ClassNotFoundException: java.lang.Cloneable$DefaultImpls
        return Bike(
            model = model,
            bikeType = bikeType,
            gear = gear
        )
    }
}