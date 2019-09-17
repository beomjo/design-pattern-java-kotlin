package k.bs.designpatternsp.pattern.abstractfactory.ex2.ap;

import k.bs.designpatternsp.pattern.abstractfactory.ex2.ap.factory.AP;
import k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.factory.Battery;

public class IPhone extends AP {

    public IPhone(Battery battery) {
        super(battery);
    }

    @Override
    protected void active() {
        System.out.println("IPhone Active");

    }
}
