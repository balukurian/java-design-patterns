package udemy.factory;

import udemy.factory.burgers.*;

public class SimpleHamburgerFactory {

    public Hamburger create(String type) {
        Hamburger hamburger = null;

        if(type.equals("cheese"))
            hamburger = new CheeseBurger();
        else if(type.equals("veggie"))
            hamburger = new VeggieBurger();
        else if(type.equals("bunless"))
            hamburger = new BunlessBurger();
        else if(type.equals("greek"))
            hamburger = new GreekBurger();
        else if(type.equals("MeatLover"))
            hamburger = new MeatLover();

        return hamburger;
    }

}
