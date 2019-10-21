package k.bs.designpatternsp.behavioral.observer.ja.use_observer_observable;

import java.util.Observable;

public class DashBoard extends Observable {

    private String content;

    public DashBoard() {
        System.out.println("DashBoard(Display Subject)Create");
    }

    public void messageChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMessage(String content) {
        this.content = content;
        messageChanged();

    }

    public String getContent() {
        return content;
    }
}
 