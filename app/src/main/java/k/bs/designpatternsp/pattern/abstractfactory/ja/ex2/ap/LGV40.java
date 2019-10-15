package k.bs.designpatternsp.pattern.abstractfactory.ja.ex2.ap;

import k.bs.designpatternsp.pattern.abstractfactory.ja.ex2.battery.Battery;

public class LGV40 implements AP {
    private Battery battery;

    public LGV40(Battery battery) {
        this.battery = battery;
    }

    @Override
    public void process() throws Exception {
        if (battery.getPower() > 0)
            active();
        else
            throw new Exception("battery is out");
    }

    @Override
    public void active() {
        System.out.println("LG Phone Active");
    }
}
