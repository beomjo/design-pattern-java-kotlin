package k.bs.designpatternsp.pattern.abstractfactory.ex2.battery;

import k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.factory.Battery;

public class SamsungBattery extends Battery {
    @Override
    public int getPower() {
        System.out.println("spent energy of samsung battery");
        return 5;
    }
}
