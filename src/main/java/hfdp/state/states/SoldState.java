package hfdp.state.states;

import hfdp.state.GumballMachineV2;

public class SoldState implements State {

    private GumballMachineV2 gumballMachine;

    public SoldState(GumballMachineV2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Dispensing gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Crank already turned");
    }

    @Override
    public void turnCrank() {
        System.out.println("Crank already turned");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Opps out of gumballs!!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
