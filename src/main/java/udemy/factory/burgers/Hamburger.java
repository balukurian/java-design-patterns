package udemy.factory.burgers;

public abstract class Hamburger {

    public String name;
    public String sauce;

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Adding Sauce.. " + sauce);
    }

    public void cook() {
        System.out.println("Cooking...");
    }

    public void box() {
        System.out.println("Boxing...");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
