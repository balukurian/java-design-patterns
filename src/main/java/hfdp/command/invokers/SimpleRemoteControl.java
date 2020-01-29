package hfdp.command.invokers;

import hfdp.command.commands.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        this.slot.execute();
    }
}
