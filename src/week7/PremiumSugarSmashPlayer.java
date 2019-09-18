package week7;

public class PremiumSugarSmashPlayer extends SugarSmashPlayer {
    Integer[] highScores = new Integer[40];

    public PremiumSugarSmashPlayer(int id, String name) {
        super(id, name);
    }


    @Override
    public void setHighScore(int level, int value) {
        int minimumPoints = 100;
        int previousLevel = level - 1;
        try {
            if (highScores[previousLevel] < minimumPoints) {
                displayLowScoreMessage();
            } else if (highScores[level] == highScores.length) {
                displayWinnerMessage();
            } else {
                highScores[level] = value;
            }

        } catch (Exception IndexOutOfBounds) {
            displayErrorMessage();
        }
    }

    public void displayWinnerMessage() {
        System.out.println("You have beaten all levels!");
    }
}
