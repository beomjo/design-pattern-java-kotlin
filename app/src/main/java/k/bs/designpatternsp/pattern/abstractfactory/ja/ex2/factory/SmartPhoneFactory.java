package k.bs.designpatternsp.pattern.abstractfactory.ja.ex2.factory;

import k.bs.designpatternsp.pattern.abstractfactory.ja.ex2.ap.AP;
import k.bs.designpatternsp.pattern.abstractfactory.ja.ex2.battery.Battery;

public interface SmartPhoneFactory {
    public AP createAP(Battery battery);
    public Battery createBattery();
}
