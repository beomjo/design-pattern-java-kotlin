package k.bs.designpatternsp.pattern.state.kt.ex2

class ShowProducts(private val vendingMachine: VendingMachine, private val request: List<String>) : State {
    override fun handleRequest(): List<String> {
        val result = request + "Show Products"
        vendingMachine.state = SelectProduct(vendingMachine, result)
        return result
    }
}