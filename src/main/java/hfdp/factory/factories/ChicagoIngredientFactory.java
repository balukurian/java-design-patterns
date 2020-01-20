package hfdp.factory.factories;

import hfdp.factory.ingredients.*;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new Spinach(), new BlackOlives(), new EggPlant()};
    }

    @Override
    public Pepperoni createPeppernoi() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
