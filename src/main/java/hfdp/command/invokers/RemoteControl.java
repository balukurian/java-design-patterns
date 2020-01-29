package hfdp.command.invokers;

import hfdp.command.commands.Command;
import hfdp.command.commands.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    private static int totalSlotPairs = 7;

    public RemoteControl() {
        onCommands = new Command[totalSlotPairs];
        offCommands = new Command[totalSlotPairs];

        Command noCommand = new NoCommand();
        for (int i = 0; i < totalSlotPairs; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void undoCommandWasPushed() {
        undoCommand.execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}
