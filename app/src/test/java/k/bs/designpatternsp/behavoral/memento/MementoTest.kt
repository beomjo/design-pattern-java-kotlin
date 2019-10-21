package k.bs.designpatternsp.behavoral.memento

import k.bs.designpatternsp.behavioral.memento.kt.CareTaker
import k.bs.designpatternsp.behavioral.memento.kt.Originator
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class MementoTest {

    @Test
    fun `MementoTest`() {
        val originator = Originator("initial state")
        val careTaker = CareTaker()
        careTaker.saveState(originator.createMemento())

        originator.state = "State #1"
        originator.state = "State #2"
        careTaker.saveState(originator.createMemento())

        originator.state = "State #3"
        println("Current State: " + originator.state)
        Assert.assertThat(originator.state, CoreMatchers.equalTo("State #3"))

        originator.restore(careTaker.restore(1))
        println("Second saved state: " + originator.state)
        Assert.assertThat(originator.state, CoreMatchers.equalTo("State #2"))

        originator.restore(careTaker.restore(0))
        println("First saved state: " + originator.state)
        Assert.assertThat(originator.state, CoreMatchers.equalTo("initial state"))

    }
}