import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private int handValue;

    public Player(String name){
        this.name = name;
        this.handValue = 0;
        this.hand = new ArrayList<Card>();
    }

    public int getHandValue() {
        return handValue;
    }

    public String getName() {
        return name;
    }

    public void addCard(Card card){
        this.hand.add(card);
        this.handValue += card.getValueFromEnum();

    }

    public int handCount() {
        return this.hand.size();
    }
}
