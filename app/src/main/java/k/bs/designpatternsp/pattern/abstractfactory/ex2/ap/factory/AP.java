package k.bs.designpatternsp.pattern.abstractfactory.ex2.ap.factory;

import k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.factory.Battery;

public abstract class AP {
    private Battery battery;

    public AP(Battery battery) {
        this.battery = battery;
    }

    public void process() throws Exception {
        if (battery.getPower() > 0)
            active();
        else
            throw new Exception("battry is out");
    }

    protected abstract void active();
}
