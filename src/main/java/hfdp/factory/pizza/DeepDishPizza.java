package hfdp.factory.pizza;

import hfdp.factory.factories.PizzaIngredientFactory;

public class DeepDishPizza extends Pizza {

    private final PizzaIngredientFactory pizzaIngredientFactory;

    public DeepDishPizza(PizzaIngredientFactory pizzaIngredientFactory, String name) {
        super.name = name;
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pizza into Square Slices");
    }

}
