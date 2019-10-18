package k.bs.designpatternsp.mediator.kt


import k.bs.designpatternsp.pattern.mediator.kt.ChatMediator
import k.bs.designpatternsp.pattern.mediator.kt.ChatUser
import org.junit.Test

class MediatorTest {

    @Test
    fun `Mediator`() {
        val mediator = ChatMediator()

        val john = ChatUser(mediator, "John")

        mediator
            .addUser(ChatUser(mediator, "Alice"))
            .addUser(ChatUser(mediator, "Bob"))
            .addUser(john)

        john.send("Hi everyone!")
    }
}