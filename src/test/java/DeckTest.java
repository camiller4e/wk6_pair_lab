import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;
    Card card;

    @Before
    public void setup(){
        card = new Card(SuitType.HEARTS, RankType.TEN);
        deck = new Deck();

    }

    @Test
    public void canAddCard(){
        deck.addCard(card);
        assertEquals(1, deck.cardCount());
    }

    @Test
    public void canPopulate(){
        deck.populateDeck();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void shuffleTest(){
        deck.populateDeck();
        Card beforeShuffle = deck.getDeck().get(0);
        deck.shuffleDeck();
        Card afterShuffle = deck.getDeck().get(0);
        assertEquals(false, beforeShuffle == afterShuffle);
    }

    @Test
    public void canRemoveCard() {
        deck.populateDeck();
        deck.removeCard();
        assertEquals(51, deck.cardCount());
    }

    @Test
    public void canGetCard(){
        deck.populateDeck();
        Card card = deck.getCard();
        assertEquals(SuitType.HEARTS, card.getSuit() );
        assertEquals(RankType.ACE, card.getRank());
    }

}
