package k.bs.designpatternsp.pattern.abstractfactory.ex2.ap;

import k.bs.designpatternsp.pattern.abstractfactory.ex2.ap.factory.AP;
import k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.factory.Battery;

public class LGV40 extends AP {

    public LGV40(Battery battery) {
        super(battery);
    }

    @Override
    protected void active() {
        System.out.println("LG Phone Active");
    }
}
