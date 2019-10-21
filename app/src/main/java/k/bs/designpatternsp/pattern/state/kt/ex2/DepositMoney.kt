package k.bs.designpatternsp.pattern.state.kt.ex2

class DepositMoney(private val vendingMachine: VendingMachine, private val request: List<String>) : State {
    override fun handleRequest(): List<String> {
        val result = request + "Deposit Money"
        vendingMachine.state = DeliverProduct(vendingMachine, result)
        return result
    }
}