package k.bs.designpatternsp.pattern.abstractfactory.ja.ex1.factory;

import k.bs.designpatternsp.pattern.abstractfactory.ja.ex1.factory.factory1.MachineFactory1;
import k.bs.designpatternsp.pattern.abstractfactory.ja.ex1.factory.factory2.MachineFactory2;

public class FactoryMain {
    public static void main(String argsp[]) {
        MachineFactory machineFactory1 = new MachineFactory1();
        machineFactory1.getMachineA().process();
        machineFactory1.getMachineB().process();

        MachineFactory machineFactory2 = new MachineFactory2();
        machineFactory2.getMachineA().process();
        machineFactory2.getMachineB().process();
    }
}
