package WarCardFinal1;

public class Admin {
    public static void printGameStatus(WarGame game) {
        System.out.println("Game Status:");
        System.out.println(game.getPlayer1().getName() + " has " + game.getPlayer1().getHandSize() + " cards.");
        System.out.println(game.getPlayer2().getName() + " has " + game.getPlayer2().getHandSize() + " cards.");
    }
}
