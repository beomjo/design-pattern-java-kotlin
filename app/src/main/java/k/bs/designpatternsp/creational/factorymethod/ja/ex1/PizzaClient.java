package k.bs.designpatternsp.creational.factorymethod.ja.ex1;

import k.bs.designpatternsp.creational.factorymethod.ja.ex1.factory.PizzaFactory;
import k.bs.designpatternsp.creational.factorymethod.ja.ex1.pizza.Pizza;
import k.bs.designpatternsp.creational.factorymethod.ja.ex1.pizza.PizzaType;

public class PizzaClient {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza1 = pizzaFactory.createPizza(PizzaType.Tomato);
        Pizza pizza2 = pizzaFactory.createPizza(PizzaType.Cheese);

        System.out.println(pizza1.getName());
        System.out.println(pizza2.getName());
    }
}
