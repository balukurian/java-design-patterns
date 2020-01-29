package udemy.command.invoker;

import udemy.command.commands.Command;

public class GameBoy {
    private Command up, down, left, right;

    public GameBoy(Command up, Command down, Command left, Command right) {
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }

    public void arrowUp() {
        up.execute();
    }

    public void arrowDown() {
        down.execute();
    }

    public void arrowLeft() {
        left.execute();
    }

    public void arrowRight() {
        right.execute();
    }
}
