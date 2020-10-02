package hfdp.proxy;

import hfdp.state.GumballMachineV2;

public class GumballMonitor {

    GumballMachineV2 gumballMachine;

    public GumballMonitor(GumballMachineV2 gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("Gumball Machine: " + gumballMachine.getLocation());
        System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
        System.out.println("Current state: " + gumballMachine.getState());
    }
}
