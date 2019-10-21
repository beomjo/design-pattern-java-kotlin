package k.bs.designpatternsp.behavioral.mediator.ja;

import android.os.Build;

import androidx.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.N)
public class ChatUser {
    private ChatMediator mediator;
    private String name;

    public ChatUser(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void send(String msg) {
        System.out.println(name + " Sending Message = " + msg);
        mediator.sendMessage(msg, this);
    }

    public void receive(String msg) {
        System.out.println(name + " Message received : " + msg);
    }
}
