package hfdp.state.states;

import hfdp.state.GumballMachineV2;

public class NoQuarterState implements State {

    GumballMachineV2 gumballMachine;

    public NoQuarterState(GumballMachineV2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter present to eject");
    }

    @Override
    public void turnCrank() {
        System.out.println("No quarter present");
    }

    @Override
    public void dispense() {
        System.out.println("No quarter present");
    }
}
