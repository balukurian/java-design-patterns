package udemy.command;

import udemy.command.characters.Mario;
import udemy.command.commands.MarioDownCommand;
import udemy.command.commands.MaripUpCommand;
import udemy.command.invoker.GameBoy;

public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario("Mario");

        GameBoy gameBoy = new GameBoy(
                new MaripUpCommand(mario),
                new MarioDownCommand(mario),
                new MarioLeftCommand(mario),
                new MarioRightCommand(mario));

        gameBoy.arrowDown();
        gameBoy.arrowDown();
        gameBoy.arrowLeft();
        gameBoy.arrowUp();
        gameBoy.arrowLeft();
        gameBoy.arrowRight();

    }
}
