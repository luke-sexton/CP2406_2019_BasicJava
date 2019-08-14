package week3;

import java.util.Random;

class Game {
    int count;
    int wins;
    private Random random = new Random();
    int secret = random.nextInt(10) + 1; // secret is assigned a random value between 1 - 10

    void makeGuess(int value) {
        count += 1;
        System.out.print("The number is " + secret + " ");

        if (value == secret) {
            wins += 1;
            System.out.print("You won!");
        } else {
            System.out.print("You lost!");
        }
    }
}
