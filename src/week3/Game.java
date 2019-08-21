package week3;

import java.util.Random;

class Game {
    int count;
    int wins;
    int secret;

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
