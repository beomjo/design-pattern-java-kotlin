package k.bs.designpatternsp.pattern.mediator.kt

class ChatUser(private val mediator: ChatMediator, private val name: String) {
    fun send(msg: String) {
        println("$name: Sending Message= $msg")
        mediator.sendMessage(msg, this)
    }

    fun receive(msg: String) {
        println("$name: Message received: $msg")
    }
}
