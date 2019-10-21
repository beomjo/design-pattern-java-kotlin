package k.bs.designpatternsp.behavioral.command.kt.ex1

class Waiter(private val pendingOrders: MutableList<Order> = mutableListOf()) {
    fun acceptOrder(vararg orders: Order) = pendingOrders.addAll(orders)

    fun serveOrders(): List<String> = pendingOrders.map { it() }
}