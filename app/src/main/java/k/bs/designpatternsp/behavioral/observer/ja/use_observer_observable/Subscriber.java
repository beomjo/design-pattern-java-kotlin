
package k.bs.designpatternsp.behavioral.observer.ja.use_observer_observable;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {

    private String content;

    public Subscriber(Observable observable) {
        observable.addObserver(this); //setObserver
    }

    public void display() {
        System.out.println("subscriber 1");
        System.out.println("content : " + content);
        System.out.println("\n");
    }

    @Override
    public void update(Observable obs, Object arg) {
        // received new source

        if (obs instanceof DashBoard) {
            DashBoard company = (DashBoard) obs;
            this.content = company.getContent();
            display();
        }
    }
}