package k.bs.designpatternsp.behavioral.command.kt.ex2

class OrderAddCommand(private val id: Long) : OrderCommand {
    override fun execute() = println("Adding order with id: $id")
}