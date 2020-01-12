package udemy.strategy_1.controller;

public class ScoreBoard {

    private ScoreAlogrithmBase scoreAlogrithmBase;

    public ScoreBoard(ScoreAlogrithmBase scoreAlogrithmBase) {
        this.scoreAlogrithmBase = scoreAlogrithmBase;
    }

    public void showScore(int taps, int multiplier) {
        System.out.println(scoreAlogrithmBase.calculateScore(taps, multiplier));
    }
}
