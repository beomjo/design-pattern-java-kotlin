package k.bs.designpatternsp.pattern.abstractfactory.ex2.battery;

import k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.factory.Battery;

public class AppleBattery extends Battery {
    @Override
    public int getPower() {
        System.out.println("spent energy of apple battery");
        return 8;
    }
}
