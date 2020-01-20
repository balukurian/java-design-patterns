package hfdp.factory.store;

import hfdp.factory.factories.ChicagoIngredientFactory;
import hfdp.factory.factories.PizzaIngredientFactory;
import hfdp.factory.pizza.DeepDishPizza;
import hfdp.factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    private final PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoPizzaStore() {
        this.pizzaIngredientFactory = new ChicagoIngredientFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        if(type.equals("deepdish"))
            return new DeepDishPizza(this.pizzaIngredientFactory, "Chicago Style Deep Dish Pizza");
        else
            return null;

    }
}
