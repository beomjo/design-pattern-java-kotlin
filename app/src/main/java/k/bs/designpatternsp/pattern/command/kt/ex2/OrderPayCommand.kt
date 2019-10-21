package k.bs.designpatternsp.pattern.command.kt.ex2

class OrderPayCommand(private val id: Long) : OrderCommand {
    override fun execute() = println("Paying for order with id: $id")
}