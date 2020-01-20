package udemy.factory.burgers;

public class JamaicanCheeseBurger extends Hamburger {

    public JamaicanCheeseBurger() {
        name = "JamaicanCheeseBurger";
        sauce = "Hot sauce";
    }

    @Override
    public void cook() {
        System.out.println("Preparing Jamaican Cheese Burger");
    }
}
