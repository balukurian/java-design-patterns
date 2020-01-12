package udemy.strategy_2;

import udemy.strategy_2.controller.CreditCardAlgorithm;
import udemy.strategy_2.controller.PayPalAlgorithm;
import udemy.strategy_2.controller.ShoppingCart;
import udemy.strategy_2.model.Product;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product pants = new Product("234", 25);
        Product shirt = new Product("456", 15);

        shoppingCart.addProduct(pants);
        shoppingCart.addProduct(shirt);

        shoppingCart.pay(new CreditCardAlgorithm("Test", "2345-6789-0123-1456"));
        shoppingCart.pay(new PayPalAlgorithm("test@test.com", "test@paypal"));
    }
}
