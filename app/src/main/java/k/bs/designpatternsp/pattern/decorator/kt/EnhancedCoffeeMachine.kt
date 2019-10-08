package k.bs.designpatternsp.pattern.decorator.kt

class EnhancedCoffeeMachine(private val coffeeMachine: CoffeeMachine) : CoffeeMachine by coffeeMachine {

    override fun makeLargeCoffee() {
        println("Enhanced: Making large coffee")
    }

    fun makeCoffeeWithMilk() {
        println("Enhanced: Making coffee with milk")
        coffeeMachine.makeSmallCoffee()
        addMilk()
    }

    private fun addMilk() {
        println("Enhanced: Adding milk")
    }
}