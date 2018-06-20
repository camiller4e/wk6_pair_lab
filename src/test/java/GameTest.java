import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Deck deck;
    Player player1, player2;
    Game game;

    @Before
    public void setup(){
        game = new Game();
        player1 = new Player("Jack");
        player2 = new Player("Campbell");
        game.addPlayer(player1);
        game.addPlayer(player2);
        deck = new Deck();
        deck.populateDeck();
        deck.shuffleDeck();
    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        assertEquals(2, game.countPlayers());
    }

    @Test
    public void testDeal(){
        game.deal();
        assertEquals(1, player1.handCount());
        assertEquals(1, player2.handCount());
    }

    @Test
    public void testCompareHands(){
        deck = new Deck();
        deck.populateDeck();
        String winner = game.compareHands();
        assertEquals("Campbell", winner);
    }

}
