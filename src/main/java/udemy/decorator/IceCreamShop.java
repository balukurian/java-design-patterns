package udemy.decorator;

public class IceCreamShop {
    public static void main(String[] args) {
        IceCream iceCream = new BasicIceCream();
        iceCream.cost();

        iceCream = new ChocolateIceCream(new MintIceCream(iceCream));
        System.out.println("Total Cost + " + iceCream.cost());

    }
}
