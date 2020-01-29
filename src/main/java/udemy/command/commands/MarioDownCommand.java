package udemy.command.commands;

import udemy.command.characters.Mario;

public class MarioDownCommand implements Command {

    private Mario mario;

    public MarioDownCommand(Mario mario) {
        this.mario = mario;
    }

    @Override
    public void execute() {
        mario.duck();
    }
}
