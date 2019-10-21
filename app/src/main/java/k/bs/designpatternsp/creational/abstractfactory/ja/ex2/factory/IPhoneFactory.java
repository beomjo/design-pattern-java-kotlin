package k.bs.designpatternsp.creational.abstractfactory.ja.ex2.factory;

import k.bs.designpatternsp.creational.abstractfactory.ja.ex2.ap.AP;
import k.bs.designpatternsp.creational.abstractfactory.ja.ex2.ap.IPhone;
import k.bs.designpatternsp.creational.abstractfactory.ja.ex2.battery.AppleBattery;
import k.bs.designpatternsp.creational.abstractfactory.ja.ex2.battery.Battery;

public class IPhoneFactory implements SmartPhoneFactory {
    @Override
    public AP createAP(Battery battery) {
        return new IPhone(battery);
    }

    @Override
    public Battery createBattery() {
        return new AppleBattery();
    }
}
