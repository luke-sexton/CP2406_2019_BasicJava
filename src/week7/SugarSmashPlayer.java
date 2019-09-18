package week7;

public class SugarSmashPlayer {
    protected int playerId;
    protected String screenName;
    protected Integer[] highScores = new Integer[10];


    public SugarSmashPlayer(int id, String name) {
        setPlayerId(id);
        setScreenName(name);
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public int getHighScore(int level) {
        int highScore = 0;
        try {
            highScore = highScores[level];
        } catch (Exception IndexOutOfBounds) {
            displayErrorMessage();
        }
        return highScore;
    }

    public void setInitialHighScore(int value) {
        highScores[0] = value;
    }

    public void setHighScore(int level, int value) {
        int minimumPoints = 100;
        int previousLevel = level - 1;
        try {
            if (highScores[previousLevel] < minimumPoints) {
                displayLowScoreMessage();
            } else if (highScores[level] != 10) {
                highScores[level] = value;
            } else {
                displayFreePlayerRestriction();
            }
        } catch (Exception IndexOutOfBounds) {
            displayErrorMessage();
        }
    }

    public void displayErrorMessage() {
        System.out.println("Error! Index out of range!");
    }

    public void displayLowScoreMessage() {
        System.out.println("You must reach 100 points or more in the previous level to set a new high score!");
    }

    public void displayFreePlayerRestriction() {
        System.out.println("You cannot add any more levels, upgrade to premium to gain access to all 40 levels!");
    }
}
