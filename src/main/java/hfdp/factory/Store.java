package hfdp.factory;

import hfdp.factory.pizza.Pizza;
import hfdp.factory.store.ChicagoPizzaStore;
import hfdp.factory.store.NYPizzaStore;
import hfdp.factory.store.PizzaStore;

public class Store {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("Order : " + pizza.getName());
        pizzaStore = new ChicagoPizzaStore();
        pizza = pizzaStore.orderPizza("deepdish");
        System.out.println("Order : " + pizza.getName());

    }
}
