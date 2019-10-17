package k.bs.designpatternsp.pattern.observer.ja.push;

import java.util.LinkedList;
import java.util.List;


public class DashBoard implements Subject {
    private List<Observer> displays;
    private String content;

    public DashBoard() {
        System.out.println("DashBoard(Display Subject)Create");
        displays = new LinkedList<Observer>();
    }

    @Override
    public void add(Observer observer) {
        displays.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if (displays.contains(observer)) {
            displays.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer display : displays) {
            display.update(content);
        }
    }

    public void setMessage(String content) {
        this.content = content;
        notifyObservers();
    }
}
 