package week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameTest {
    @Test
    void checkSecret() {
        Game game = new Game();
        boolean validSecret = game.secret > 0 && game.secret < 11;
        assertTrue(validSecret);
    }

    @Test
    void checkPlayCount() {
        Game game = new Game();
        assertEquals(0, game.count);
        assertEquals(0, game.wins);

        game.makeGuess(game.secret); //check for a win
        assertEquals(1, game.count);
        assertEquals(1, game.wins);

        game.makeGuess(-1); // check for a lose
        assertEquals(2, game.count);
        assertEquals(1, game.wins);
    }

}