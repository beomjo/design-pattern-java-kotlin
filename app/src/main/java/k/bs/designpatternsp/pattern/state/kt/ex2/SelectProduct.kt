package k.bs.designpatternsp.pattern.state.kt.ex2

class SelectProduct(private val vendingMachine: VendingMachine, private val request: List<String>) : State {
    override fun handleRequest(): List<String> {
        val result = request + "Select Product"
        vendingMachine.state = DepositMoney(vendingMachine, result)
        return result
    }
}
