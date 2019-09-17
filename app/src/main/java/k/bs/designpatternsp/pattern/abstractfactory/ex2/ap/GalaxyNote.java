package k.bs.designpatternsp.pattern.abstractfactory.ex2.ap;

import k.bs.designpatternsp.pattern.abstractfactory.ex2.ap.factory.AP;
import k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.factory.Battery;

public class GalaxyNote extends AP {

    public GalaxyNote(Battery battery) {
        super(battery);
    }

    @Override
    protected void active() {
        System.out.println("GalaxyNote Phone Active");
    }
}
