package k.bs.designpatternsp.pattern.abstractfactory.ex2.battery;

public class LGBattery implements Battery {
    @Override
    public int getPower() {
        System.out.println("spent energy of lg battery");
        return 10;
    }
}
