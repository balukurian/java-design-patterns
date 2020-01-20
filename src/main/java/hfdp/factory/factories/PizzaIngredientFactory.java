package hfdp.factory.factories;

import hfdp.factory.ingredients.*;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPeppernoi();
    Clams createClam();
}
