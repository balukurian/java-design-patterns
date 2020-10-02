package hfdp.state.states;

import hfdp.state.GumballMachineV2;

public class SoldOutState implements State {

    private GumballMachineV2 gumballMachine;

    public SoldOutState(GumballMachineV2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("No gumballs present to dispense");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No gumballs present to dispense");
    }

    @Override
    public void turnCrank() {
        System.out.println("No gumballs present to dispense");
    }

    @Override
    public void dispense() {
        System.out.println("No gumballs present to dispense");
    }
}
