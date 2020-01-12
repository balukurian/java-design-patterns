package udemy.strategy_1.model;

import udemy.strategy_1.controller.ScoreAlogrithmBase;

public class Balloon extends ScoreAlogrithmBase {

    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 10;
    }
}
