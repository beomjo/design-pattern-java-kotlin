package k.bs.designpatternsp.decorator

import k.bs.designpatternsp.pattern.decorator.kt.EnhancedCoffeeMachine
import k.bs.designpatternsp.pattern.decorator.kt.NormalCoffeeMachine
import org.junit.Test

class DecoratorTest {

    @Test
    fun Decorator() {
        val normalMachine = NormalCoffeeMachine()
        val enhancedMachine = EnhancedCoffeeMachine(normalMachine)

        // non-overridden behaviour
        enhancedMachine.makeSmallCoffee()
        // overridden behaviour
        enhancedMachine.makeLargeCoffee()
        // extended behaviour
        enhancedMachine.makeCoffeeWithMilk()
    }
}