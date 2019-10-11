package k.bs.designpatternsp.pattern.flyweight.ja.car;

public class Client {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        System.out.println(factory.getCar("Car A"));
        System.out.println(factory.getCar("Car B"));
        System.out.println(factory.getCar("Car C"));
        System.out.println(factory.getCar("Car B"));
        System.out.println(factory.getCar("Car A"));
        System.out.println(factory.getCar("Car A"));
    }
}
