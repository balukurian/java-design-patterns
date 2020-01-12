package udemy.strategy_1;

import udemy.strategy_1.controller.ScoreBoard;
import udemy.strategy_1.model.Balloon;
import udemy.strategy_1.model.SquareBalloon;

public class Main {
    public static void main(String[] args) {
        ScoreBoard sc = new ScoreBoard(new Balloon());
        sc.showScore(10, 5);

        sc = new ScoreBoard(new SquareBalloon());
        sc.showScore(10, 5);
    }
}
