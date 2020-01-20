package hfdp.factory.store;

import hfdp.factory.factories.ChicagoIngredientFactory;
import hfdp.factory.factories.PizzaIngredientFactory;
import hfdp.factory.pizza.*;

public class NYPizzaStore extends PizzaStore {

    private final PizzaIngredientFactory pizzaIngredientFactory;

    public NYPizzaStore() {
        this.pizzaIngredientFactory = new ChicagoIngredientFactory();
    }

    @Override
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new CheesePizza(pizzaIngredientFactory, "New York Style Cheese Pizza");
            case "veggie":
                return new VeggiePizza();
            case "clam":
                return new ClamPizza(pizzaIngredientFactory, "New York Style Clam Pizza");
            case "pepperoni":
                return new PepperoniPizza();
            default:
                return null;
        }
    }
}
