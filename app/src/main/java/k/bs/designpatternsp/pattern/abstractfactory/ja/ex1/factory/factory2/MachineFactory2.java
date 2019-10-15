package k.bs.designpatternsp.pattern.abstractfactory.ja.ex1.factory.factory2;

import k.bs.designpatternsp.pattern.abstractfactory.ja.ex1.factory.machines.a.MachineA;
import k.bs.designpatternsp.pattern.abstractfactory.ja.ex1.factory.machines.a.MachineA2;
import k.bs.designpatternsp.pattern.abstractfactory.ja.ex1.factory.machines.b.MachineB;
import k.bs.designpatternsp.pattern.abstractfactory.ja.ex1.factory.machines.b.MachineB2;
import k.bs.designpatternsp.pattern.abstractfactory.ja.ex1.factory.MachineFactory;

public class MachineFactory2 implements MachineFactory {
    @Override
    public MachineA getMachineA() {
        return new MachineA2();
    }

    @Override
    public MachineB getMachineB() {
        return new MachineB2();
    }
}
