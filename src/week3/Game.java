package week3;

import java.util.Random;

class Game {
    int count;
    int wins;
    int secret;

    // Initial-Value Constructor
    public Game(int min, int max) {
        Random random = new Random();
        this.secret = min + random.nextInt(max - min); // secret is assigned a random value between 1 - 10
    }

    void makeGuess(int value) {
        count += 1;
        System.out.println("The number is " + secret + " ");

        if (value == secret) {
            wins += 1;
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
}
