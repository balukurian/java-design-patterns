package hfdp.template;


/*
    Template method pattern
    has method, which encapsulates an algorithm. Child classes will provide implementation for part of the algorithm

    hooks in template pattern, with hooks we can decide if a method in algorithm needs to be invoked or not
    implementation of the hook method can be overridden by the child classes to return their logic, by default it will be true or a default
    implementation will be provided by the abstract class

 */

public abstract class CaffeineBeverage {

    public final void  prepareRecipe() {

        // method can be invoked by implementing classes
        // implementation will be with child class

        boilWater();
        brew();
        pourInCup();

        // hook method deciding if addCondiments should be called
        if(canAddCondiments())
            addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();
    void boilWater() { }
    void pourInCup() { }

    /**
     * hook method
     * @return a boolean value to indicate if the method hooked on this should be called
     */
    public boolean canAddCondiments() {
        return true;
    }

}
