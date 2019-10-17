
package k.bs.designpatternsp.pattern.observer.ja.push;

public class Messenger {
    public static void main(String[] args) {
        DashBoard dashBoard = new DashBoard(); //Subject class create
        new Subscriber(dashBoard);
        new Subscriber2(dashBoard);

        dashBoard.setMessage("some event"); //Subject new message send
    }
}
 