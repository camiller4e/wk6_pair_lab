import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Game {
    public ArrayList<Player> players;
    private Deck deck;

    public Game() {
        this.players = new ArrayList<Player>();
        this.deck = new Deck();
        deck.populateDeck();
        deck.shuffleDeck();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int countPlayers() {
        return this.players.size();
    }

    public void deal() {
        for (Player player : this.players) {
            Card card = this.deck.getCard();
            player.addCard(card);
            this.deck.removeCard();
        }
    }

    public String  compareHands() {
        HashMap<String, Integer> gamers = new HashMap<String, Integer>();
        for (Player player : this.players) {
            gamers.put(player.getName(), player.getHandValue());
        }
//        int maxValueInGamers = (Collections.max(gamers.values()));
//        for (Map.Entry<String, Integer> entry : gamers.entrySet()) {
//            if (entry.getValue() == maxValueInGamers) {
//                return entry.getKey();
//            }
//        }

        String name = Collections.max(gamers.entrySet(), Map.Entry.comparingByValue()).getKey();
        return name;
    }
}