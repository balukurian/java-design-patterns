package hfdp.template;

public class CoffeeHook extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("adding milk and sugar");
    }

    @Override
    public boolean canAddCondiments() {
        String answer = getUserInput();
        return "y".equals(answer);
    }

    private String getUserInput() {
        return "n";
    }
}
