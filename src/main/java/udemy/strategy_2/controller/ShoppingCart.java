package udemy.strategy_2.controller;

import udemy.strategy_2.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Product product:this.products) {
            sum += product.getPrice();
        }
        return sum;
    }

    public void pay(Payment paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
