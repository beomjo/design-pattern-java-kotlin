package k.bs.designpatternsp.creational.abstractfactory.ja.ex2.battery;

public class AppleBattery implements Battery {
    @Override
    public int getPower() {
        System.out.println("spent energy of apple battery");
        return 8;
    }
}
