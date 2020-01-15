package udemy.decorator;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("Creating a basic ice cream");
    }

    @Override
    public double cost() {
        System.out.println("Adding Basic Ice Cream");
        return 0.50;
    }
}
