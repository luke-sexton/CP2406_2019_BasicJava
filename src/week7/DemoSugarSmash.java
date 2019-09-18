package week7;

public class DemoSugarSmash {
    public static void main(String[] args) {
        SugarSmashPlayer player = new SugarSmashPlayer(1, "Jim"); // free version player
        int initialScore = 80;
        int highScore = 101;

        player.setInitialHighScore(initialScore);
        System.out.println("Level One High Score: " + player.getHighScore(0));

        player.setHighScore(1, highScore); // check for low score message
        player.setInitialHighScore(highScore);
        player.setHighScore(1, highScore);
        System.out.println(player.getHighScore(1));

//        for (int level = 1; level < 10; ++level) {   // set high score for all available levels
//            player.setHighScore(level, highScore += 10);
//        }
//        player.setHighScore(10, 150); // check for free player restriction message
//
//        PremiumSugarSmashPlayer premiumPlayer = new PremiumSugarSmashPlayer(player.getPlayerId(), player.getScreenName());
//        premiumPlayer.getHighScore(9);
    }
}

