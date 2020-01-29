package hfdp.command.commands;

public class MacroCommand implements Command {

    Command[] commands;

    @Override
    public void execute() {
        for (Command command: this.commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command: this.commands) {
            command.undo();
        }
    }
}
