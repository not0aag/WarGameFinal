package WarCardFinal1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GroupOfCards {
    private List<Card> cards;

    public GroupOfCards() {
        cards = new LinkedList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String suit : suits) {
            for (int rank = 2; rank <= 14; rank++) {
                cards.add(new Card(suit, rank));
            }
        }
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        return cards.isEmpty() ? null : cards.remove(0);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public void addCard(Card card) {
        cards.add(card);
    }
}
