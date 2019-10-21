
package k.bs.designpatternsp.behavioral.observer.ja.use_observer_observable;

public class Messenger {
    public static void main(String[] args) {
        DashBoard company = new DashBoard(); //Subject class create
        Subscriber subscriber1 = new Subscriber(company);
        Subscriber2 subscriber2 = new Subscriber2(company);

        company.setMessage("some event"); //Subject new message send
    }
}
 