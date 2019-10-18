package k.bs.designpatternsp.pattern.mediator.kt

class ChatMediator {

    private val users: MutableList<ChatUser> = ArrayList()

    fun sendMessage(msg: String, user: ChatUser) {
        users
            .filter { it != user }
            .forEach { it.receive(msg) }
    }

    fun addUser(user: ChatUser): ChatMediator =
        apply { users.add(user) }
}
