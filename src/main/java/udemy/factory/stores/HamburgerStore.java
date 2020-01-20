package udemy.factory.stores;

import udemy.factory.burgers.Hamburger;

public abstract class HamburgerStore {

    public HamburgerStore() {
    }

    public Hamburger order(String type) {
        //Hamburger hamburger = hamburgerFactory.create(type);
        Hamburger hamburger = create(type);

        hamburger.prepare();
        hamburger.cook();
        hamburger.box();

        return hamburger;
    }

    abstract public Hamburger create(String type);

}
