package k.bs.designpatternsp.behavioral.strategy.ja;

public class Client {
    public static void main(String[] args) {
        Moving train = new Train();
        Moving bus = new Bus();

        train.setMovableStrategy(new RailLoadStrategy());
        bus.setMovableStrategy(new LoadStrategy());

        train.move();
        bus.move();


        /** rail load bus development*/
        bus.setMovableStrategy(new RailLoadStrategy());
        bus.move();
    }
}
