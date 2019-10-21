package k.bs.designpatternsp.behavoral.composite.kt

import k.bs.designpatternsp.structural.composite.kt.computer.HardDrive
import k.bs.designpatternsp.structural.composite.kt.computer.Memory
import k.bs.designpatternsp.structural.composite.kt.computer.PersonalComputer
import k.bs.designpatternsp.structural.composite.kt.computer.Processor
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class CompositeTest {

    @Test
    fun `Composite`() {
        val pc = PersonalComputer()
            .add(Processor())
            .add(HardDrive())
            .add(Memory())

        println(pc.price)

        Assert.assertThat(pc.name, CoreMatchers.equalTo("PC"))
        Assert.assertThat(pc.price, CoreMatchers.equalTo(1600))
    }
}