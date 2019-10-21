package k.bs.designpatternsp.behavioral.state.kt.ex2

class DeliverProduct(private val vendingMachine: VendingMachine, private val request: List<String>) : State {
    override fun handleRequest(): List<String> {
        val result = request + "Deliver Product"

        vendingMachine.state = ShowProducts(vendingMachine, result)
        return result
    }
}