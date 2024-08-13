package WarCardFinal1;

import java.util.ArrayList;
import java.util.List;

public class WarGame extends Games {
    private GroupOfCards deck;

    public WarGame(String name) {
        super(name);
        this.deck = new GroupOfCards();
    }

    public void setup(WarPlayer player1, WarPlayer player2) {
        while (!deck.isEmpty()) {
            player1.addCard(deck.dealCard());
            player2.addCard(deck.dealCard());
        }
    }

    @Override
    public void play() {
        while (players.get(0).hasCards() && players.get(1).hasCards()) {
            Card card1 = players.get(0).play();
            Card card2 = players.get(1).play();

            System.out.println(players.get(0).getName() + " plays " + card1);
            System.out.println(players.get(1).getName() + " plays " + card2);

            List<Card> warPile = new ArrayList<>();
            warPile.add(card1);
            warPile.add(card2);

            if (card1.getRank() > card2.getRank()) {
                ((WarPlayer) players.get(0)).collectCards(warPile);
                System.out.println(players.get(0).getName() + " wins the round.");
            } else if (card1.getRank() < card2.getRank()) {
                ((WarPlayer) players.get(1)).collectCards(warPile);
                System.out.println(players.get(1).getName() + " wins the round.");
            } else {
                System.out.println("War!");
                List<Card> warCards1 = ((WarPlayer) players.get(0)).warHand();
                List<Card> warCards2 = ((WarPlayer) players.get(1)).warHand();
                warPile.addAll(warCards1);
                warPile.addAll(warCards2);

                if (!warCards1.isEmpty() && !warCards2.isEmpty()) {
                    Card warCard1 = players.get(0).playCard();
                    Card warCard2 = players.get(1).playCard();
                    if (warCard1.getRank() > warCard2.getRank()) {
                        ((WarPlayer) players.get(0)).collectCards(warPile);
                    } else if (warCard1.getRank() < warCard2.getRank()) {
                        ((WarPlayer) players.get(1)).collectCards(warPile);
                    } else {
                        
                    }
                } else {
                    break; 
                }
            }
        }
    }

    @Override
    public Player determineWinner() {
        if (players.get(0).hasCards() && !players.get(1).hasCards()) {
            return players.get(0);
        } else if (players.get(1).hasCards() && !players.get(0).hasCards()) {
            return players.get(1);
        } else {
            return null; 
        }
    }

    public WarPlayer getPlayer1() {
        return (WarPlayer) players.get(0);
    }

    public WarPlayer getPlayer2() {
        return (WarPlayer) players.get(1);
    }
}
