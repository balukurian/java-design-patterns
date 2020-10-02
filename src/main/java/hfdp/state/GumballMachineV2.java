package hfdp.state;

import hfdp.state.states.*;

public class GumballMachineV2 {

    State hasQuarterState;
    State noQuarterState;
    State soldOutState;
    State soldState;
    int count = 0;
    State currentState = soldOutState;
    private String location;

    public GumballMachineV2(int count, String location) {
        this.location = location;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        this.count = count;

        if (count > 0)
            currentState = noQuarterState;

    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0)
            count--;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    public String getLocation() {
        return location;
    }

    public void setState(State currentState) {
        this.currentState = currentState;
    }

    public String getState() {
        return currentState.toString();
    }
}
