package k.bs.designpatternsp.pattern.abstractfactory.ex2.ap;

import k.bs.designpatternsp.pattern.abstractfactory.ex2.battery.Battery;

public class GalaxyNote implements AP {
    private Battery battery;

    public GalaxyNote(Battery battery) {
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
        System.out.println("GalaxyNote Phone Active");
    }
}