package hfdp.strategy;

import hfdp.strategy.behavior.FlyWithWings;
import hfdp.strategy.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck");
    }
}
