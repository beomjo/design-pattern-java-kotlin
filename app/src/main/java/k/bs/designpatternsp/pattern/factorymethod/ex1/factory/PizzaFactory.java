package k.bs.designpatternsp.pattern.factorymethod.ex1.factory;


import k.bs.designpatternsp.pattern.factorymethod.ex1.pizza.CheesePizza;
import k.bs.designpatternsp.pattern.factorymethod.ex1.pizza.Pizza;
import k.bs.designpatternsp.pattern.factorymethod.ex1.pizza.PizzaType;
import k.bs.designpatternsp.pattern.factorymethod.ex1.pizza.TomatoPizza;

public class PizzaFactory extends Factory {
    @Override
    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case Tomato:
                return new TomatoPizza();
            case Cheese:
                return new CheesePizza();
        }
        return null;
    }
}
