package k.bs.designpatternsp.pattern.abstractfactory.ex2;

import k.bs.designpatternsp.pattern.abstractfactory.ex2.ap.factory.APFactory;
import k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.factory.BatteryFactory;

public class Client {
    public static void main(String[] args) throws Exception {
        APFactory.createAP(Vendor.LG, BatteryFactory.createBattery(Vendor.LG)).process();
    }
}
