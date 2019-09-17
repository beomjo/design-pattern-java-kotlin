package k.bs.designpatternsp.pattern.abstractfactory.ex2.factory;

import k.bs.designpatternsp.pattern.abstractfactory.ex2.ap.AP;
import k.bs.designpatternsp.pattern.abstractfactory.ex2.ap.LGV40;
import k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.Battery;
import k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.LGBattery;

public class V40Factory implements SmartPhoneFactory {
    @Override
    public AP createAP(Battery battery) {
        return new LGV40(battery);
    }

    @Override
    public Battery createBattery() {
        return new LGBattery();
    }
}
