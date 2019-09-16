package k.bs.designpatternsp.pattern.abstractfactory.ex1.factory;

import k.bs.designpatternsp.pattern.abstractfactory.ex1.factory.machines.a.MachineA;
import k.bs.designpatternsp.pattern.abstractfactory.ex1.factory.machines.b.MachineB;

public interface MachineFactory {
    public MachineA getMachineA();

    public MachineB getMachineB();
}
