package k.bs.designpatternsp.behavioral.mediator.ja;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;

@RequiresApi(api = Build.VERSION_CODES.N)
public class ChatMediator {
    private List<ChatUser> users = new ArrayList<>();

    public void sendMessage(String msg, ChatUser user) {
        users.stream()
                .filter(u -> u != user)
                .forEach(u -> u.receive(msg));
    }

    public ChatMediator addUser(ChatUser user) {
        users.add(user);
        return this;
    }
}
