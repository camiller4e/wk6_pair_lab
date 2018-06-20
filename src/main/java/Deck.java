import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;
    private SuitType suit;
    private RankType rank;

    public Deck(){
        this.deck = new ArrayList<Card>();
    }



    public void addCard(Card card){
        this.deck.add(card);
    }

    public int cardCount() {
        return this.deck.size();
    }

    public void populateDeck(){
        for (SuitType suit: SuitType.values()){
            for (RankType rank: RankType.values()){
                Card card = new Card(suit, rank);
                addCard(card);
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void removeCard() {
        deck.remove(0);
    }

    public Card getCard() {
        return deck.get(0);
    }
}
