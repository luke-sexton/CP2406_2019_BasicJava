package week3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner input = new Scanner(System.in);

        System.out.print("Take a guess between 1 and 10: ");
        game.makeGuess(input.nextInt());
    }

}
