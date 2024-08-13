package WarCardFinal1;

import java.util.ArrayList;
import java.util.List;

public abstract class Games {
    protected List<Player> players;
    private String name;

    public Games(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public abstract void play();
    public abstract Player determineWinner();
}
