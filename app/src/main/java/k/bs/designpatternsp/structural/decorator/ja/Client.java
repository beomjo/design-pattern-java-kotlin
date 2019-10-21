package k.bs.designpatternsp.structural.decorator.ja;

public class Client {
    public static void main(String[] args) {
        Cake cake = new Cake();
        Cake creamCake = new CreamDecorator(cake);
        Cake strawberryCreamCake = new StrawberryDecorator(creamCake);
        System.out.println(strawberryCreamCake.getCake());
    }
}
