package k.bs.designpatternsp.pattern.abstractfactory.ex1.factory.factory1;

import k.bs.designpatternsp.pattern.abstractfactory.ex1.factory.machines.a.MachineA;
import k.bs.designpatternsp.pattern.abstractfactory.ex1.factory.machines.a.MachineA1;
import k.bs.designpatternsp.pattern.abstractfactory.ex1.factory.machines.b.MachineB;
import k.bs.designpatternsp.pattern.abstractfactory.ex1.factory.machines.b.MachineB1;
import k.bs.designpatternsp.pattern.abstractfactory.ex1.factory.MachineFactory;

public class MachineFactory1 implements MachineFactory {
    @Override
    public MachineA getMachineA() {
        return new MachineA1();
    }

    @Override
    public MachineB getMachineB() {
        return new MachineB1();
    }
}
