
package k.bs.designpatternsp.behavioral.observer.ja.push;

public class Subscriber implements Observer {

    private String content;

    public Subscriber(Subject subject) {
        subject.add(this);
    }

    @Override
    public void update(String content) {
        this.content = content;
        display();
    }


    private void display() {
        System.out.println("subscriber 1");
        System.out.println("content : " + content);
        System.out.println("\n");
    }
}