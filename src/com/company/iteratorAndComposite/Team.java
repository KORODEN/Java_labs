package com.company.iteratorAndComposite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player){
        players.add(player);
    }

    public void removePlayer(Player player){
        players.remove(player);
    }

    public void winGame(){
        for(Player player: players){
            player.action();
        }
        System.out.println("They win the game!!!");
    }
}
