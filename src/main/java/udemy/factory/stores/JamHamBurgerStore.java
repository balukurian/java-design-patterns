package udemy.factory.stores;

import udemy.factory.burgers.Hamburger;
import udemy.factory.burgers.JamaicanCheeseBurger;
import udemy.factory.burgers.JamaicanVeggieBurger;

public class JamHamBurgerStore extends HamburgerStore {

    @Override
    public Hamburger create(String type) {
        if(type.equals("cheese"))
            return new JamaicanCheeseBurger();
        else if(type.equals("veggie"))
            return new JamaicanVeggieBurger();

        return null;
    }
}
