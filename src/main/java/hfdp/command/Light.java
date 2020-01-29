package hfdp.command;

public class Light {

    private boolean on = false;

    public void on() {
        on = true;
        System.out.println("Light is turned on");
    }
    public void off() {
        on = false;
        System.out.println("Light is turned off");
    }

    public boolean isOn() {
        return on;
    }
}
