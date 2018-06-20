import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Consumer;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void setUp() throws Exception {
        card = new Card(SuitType.HEARTS, RankType.TEN);
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.TEN, card.getRank());
    }

    @Test
    public void canGetValueFromCard(){
        assertEquals(10, card.getValueFromEnum());
    }

    @Test
    public void testPrettyName(){
        assertEquals("Ten of HEARTS", card.prettyName());
    }

    @Test
    public void canGetAllSuite() {
        SuitType[] expected = {SuitType.HEARTS, SuitType.DIAMONDS, SuitType.SPADES, SuitType.CLUBS};
        SuitType[] suits = SuitType.values();
        assertEquals(4, suits.length);
        assertArrayEquals(expected, suits);
    }

    @Test
    public void canLoopThroughSuits(){
        ArrayList<SuitType> suits = new ArrayList<SuitType>();
        for (SuitType suit : SuitType.values()){
            suits.add(suit);
        }
        assertEquals(4, suits.size());
    }

}
