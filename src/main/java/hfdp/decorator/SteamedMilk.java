package hfdp.decorator;

public class SteamedMilk extends CondimentDecorator {

    private Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return .10 + this.beverage.cost();
    }
}
