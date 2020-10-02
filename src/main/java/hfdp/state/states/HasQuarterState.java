package hfdp.state.states;

import hfdp.state.GumballMachineV2;

public class HasQuarterState implements State {

    GumballMachineV2 gumballMachine;

    public HasQuarterState(GumballMachineV2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter already inserted");
    }

    @Override
    public void ejectQuarter() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

}
