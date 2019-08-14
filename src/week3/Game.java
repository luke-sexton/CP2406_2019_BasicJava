package week3;

import java.util.Random;

public class Game {
    int count;
    int wins;
    private Random random = new Random();
    int secret = random.nextInt(10) + 1; // secret is assigned a random value between 1 - 10

    void makeGuess(int value) {
        count += 1;
        if (value == secret) {
            wins += 1;
        }
    }
}
