package k.bs.designpatternsp.creational.abstractfactory.ja.ex1.factory;

import k.bs.designpatternsp.creational.abstractfactory.ja.ex1.factory.machines.a.MachineA;
import k.bs.designpatternsp.creational.abstractfactory.ja.ex1.factory.machines.b.MachineB;

public interface MachineFactory {
    public MachineA getMachineA();

    public MachineB getMachineB();
}
