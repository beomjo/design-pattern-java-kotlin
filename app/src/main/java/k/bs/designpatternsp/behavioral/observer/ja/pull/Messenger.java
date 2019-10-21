
package k.bs.designpatternsp.behavioral.observer.ja.pull;

public class Messenger {

    public static void main(String[] args) {
        DashBoard dashBoard = new DashBoard(); //Subject class create
        Subscriber subscriber = new Subscriber(dashBoard);
        Subscriber2 subscriber2 = new Subscriber2(dashBoard);

        dashBoard.setMessage("some event"); //Subject new message send

        subscriber.pullContent();
        subscriber2.pullContent();
    }

}
 