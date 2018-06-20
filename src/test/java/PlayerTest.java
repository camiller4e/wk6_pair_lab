import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Deck deck;
    Card card1, card2;
    Player player1, player2;

    @Before
    public void setup(){
        card1 = new Card(SuitType.HEARTS, RankType.TEN);
        card2 = new Card(SuitType.SPADES, RankType.ACE);
        deck = new Deck();
        player1 = new Player("Jack");
        player2 = new Player("Campbell");
    }

    @Test
    public void canAddCard(){
        player1.addCard(card1);
        assertEquals(1, player1.handCount());
        assertEquals(10, player1.getHandValue());
    }

}

