package WarCardFinal1;

import java.util.ArrayList;
import java.util.List;

public class WarPlayer extends Player {
    public WarPlayer(String name) {
        super(name);
    }

    @Override
    public Card play() {
        return playCard(); 
    }

    public List<Card> warHand() {
        List<Card> warCards = new ArrayList<>();
        if (getHandSize() >= 3) {
            for (int i = 0; i < 3; i++) {
                warCards.add(playCard());
            }
        }
        return warCards;
    }
}
