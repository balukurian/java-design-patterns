package udemy.command;

import udemy.command.characters.Mario;
import udemy.command.commands.Command;

public class MarioLeftCommand implements Command {
    private Mario mario;
    public MarioLeftCommand(Mario mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        this.mario.moveLeft();
    }
}
