package udemy.command.commands;

import udemy.command.characters.Mario;

public class MaripUpCommand implements Command {

    private Mario mario;

    public MaripUpCommand(Mario mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.jumpUp();
    }
}
