package WarCardFinal1;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public int getHandSize() {
        return hand.size();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card playCard() {
        return hand.isEmpty() ? null : hand.remove(0);
    }

    public boolean hasCards() {
        return !hand.isEmpty();
    }

    public void collectCards(List<Card> cards) {
        hand.addAll(cards);
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract Card play();
}
