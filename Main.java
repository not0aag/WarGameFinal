package WarCardFinal1;

public class Main {
    public static void main(String[] args) {
        WarPlayer player1 = new WarPlayer("Aditya");
        WarPlayer player2 = new WarPlayer("Alen");

        WarGame game = new WarGame("War Game");
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.setup(player1, player2);
        game.play();

        Player winner = game.determineWinner();
        if (winner != null) {
            System.out.println("Winner: " + winner.getName());
        } else {
            System.out.println("It's a tie!");
        }

        Admin.printGameStatus(game);
    }
}
