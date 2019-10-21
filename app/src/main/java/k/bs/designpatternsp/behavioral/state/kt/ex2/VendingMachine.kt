package k.bs.designpatternsp.behavioral.state.kt.ex2

class VendingMachine {
    var state: State = ShowProducts(this, listOf())

    fun proceed(): List<String> = state.handleRequest()
}