package hfdp.composite;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        for (MenuComponent menuComponent: allMenus) {
            try {
                if(menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException ex) {
                ex.printStackTrace();
            }
        }
    }
}
