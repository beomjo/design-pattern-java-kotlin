package k.bs.designpatternsp.pattern.abstractfactory.ex2.ap;

import k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.Battery;

public class IPhone implements AP {
    private Battery battery;

    public IPhone(Battery battery) {
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
        System.out.println("IPhone Active");

    }
}
