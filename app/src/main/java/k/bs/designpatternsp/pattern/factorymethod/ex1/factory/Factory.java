package k.bs.designpatternsp.pattern.factorymethod.ex1.factory;

import k.bs.designpatternsp.pattern.factorymethod.ex1.pizza.Pizza;
import k.bs.designpatternsp.pattern.factorymethod.ex1.pizza.PizzaType;

public abstract class Factory {
    public abstract Pizza createPizza(PizzaType name);
}
