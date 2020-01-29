package hfdp.command.commands;

import hfdp.command.Light;

public class LightCommand implements Command {

    Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if(this.light.isOn())
            this.light.off();
        else
            this.light.on();
    }

    @Override
    public void undo() {
        if(this.light.isOn())
            this.light.off();
        else
            this.light.on();
    }
}
