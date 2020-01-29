package udemy.command;

import udemy.command.characters.Mario;
import udemy.command.commands.Command;

public class MarioRightCommand implements Command {
    private Mario mario;
    public MarioRightCommand(Mario mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        this.mario.moveRight();
    }
}
