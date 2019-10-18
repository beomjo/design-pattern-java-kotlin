package k.bs.designpatternsp.mediator.ja;

import k.bs.designpatternsp.pattern.mediator.ja.ChatMediator;
import k.bs.designpatternsp.pattern.mediator.ja.ChatUser;

public class MediatorTest {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();

        ChatUser john = new ChatUser(mediator,"John");

        mediator.addUser(new ChatUser(mediator,"Alice"))
                .addUser(new ChatUser(mediator,"Bob"))
                .addUser(john);

        john.send("Hi every one!");
    }
}
