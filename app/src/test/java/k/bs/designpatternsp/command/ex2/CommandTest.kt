package k.bs.designpatternsp.command.ex2

import k.bs.designpatternsp.pattern.command.kt.ex2.CommandProcessor
import k.bs.designpatternsp.pattern.command.kt.ex2.OrderAddCommand
import k.bs.designpatternsp.pattern.command.kt.ex2.OrderPayCommand
import org.junit.jupiter.api.Test

class CommandTest {

    @Test
    fun Command() {
        CommandProcessor()
            .addToQueue(OrderAddCommand(1L))
            .addToQueue(OrderAddCommand(2L))
            .addToQueue(OrderPayCommand(2L))
            .addToQueue(OrderPayCommand(1L))
            .processCommands()
    }
}