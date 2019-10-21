package k.bs.designpatternsp.creational.prototype.kt

import org.hamcrest.CoreMatchers.*
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BikeTest {
    private val service = PrototypeService<Bike>()
    private val basicBike = Bike("Leopard", "Standard", 4)
    private val advancedBike = Bike("Jaguar", "advanced", 6)

    @Before
    fun before() {
        service.register("Leopard", basicBike)
        service.register("Jaguar", advancedBike)
    }

    @Test
    fun checkModel() {
        //given

        //when
        val cloneBasicBike = service.createClone("Leopard")
        val cloneAdvancedBike = service.createClone("Jaguar")

        //then
        Assert.assertThat(cloneBasicBike?.model, `is`(basicBike.model))
        Assert.assertThat(cloneAdvancedBike?.model, `is`(advancedBike.model))
    }

    @Test
    fun checkHashCode() {
        //given

        //when
        val cloneBasicBike = service.createClone("Leopard")
        val cloneAdvancedBike = service.createClone("Jaguar")


        //then
        Assert.assertThat(basicBike.hashCode(), not(cloneBasicBike.hashCode()))
        Assert.assertThat(advancedBike.hashCode(), not(cloneAdvancedBike.hashCode()))

    }

    @Test
    fun checkInternalObjectHashCode() {
        //given

        //when
        val cloneBasicBike = service.createClone("Leopard")
        val cloneAdvancedBike = service.createClone("Jaguar")


        //then
        Assert.assertThat(basicBike.someObject.hashCode(), `is`(cloneBasicBike?.someObject.hashCode()))
        Assert.assertThat(advancedBike.someObject.hashCode(), `is`(cloneAdvancedBike?.someObject.hashCode()))
    }
}