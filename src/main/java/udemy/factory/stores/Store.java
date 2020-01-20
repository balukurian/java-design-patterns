package udemy.factory.stores;

import udemy.factory.burgers.Hamburger;

public class Store {
    public static void main(String[] args) {
        HamburgerStore hamburgerStore = new JamHamBurgerStore();
        HamburgerStore mozStore = new MozHamburgerStore();

        Hamburger hamburger = hamburgerStore.order("cheese");

        System.out.println(hamburger.toString());
    }
}
