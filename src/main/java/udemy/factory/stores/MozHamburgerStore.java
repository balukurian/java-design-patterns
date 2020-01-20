package udemy.factory.stores;

import udemy.factory.burgers.Hamburger;
import udemy.factory.burgers.MozCheeseBurger;
import udemy.factory.burgers.MozVeggieBurger;

public class MozHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger create(String type) {
        if(type.equals("cheeese"))
            return new MozCheeseBurger();
        else if(type.equals("veggie"))
            return new MozVeggieBurger();

        return null;
    }
}
