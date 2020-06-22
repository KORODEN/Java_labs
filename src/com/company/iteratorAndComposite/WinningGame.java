package com.company.iteratorAndComposite;

public class WinningGame {
    public static void main(String[] args) {
        Team team = new Team();

        Player attackPlayer = new AttackPlayer();
        Player midfielderPlayer = new MidfielderPlayer();
        Player defenderPlayer = new DefenderPlayer();

        team.addPlayer(defenderPlayer);
        team.addPlayer(midfielderPlayer);
        team.addPlayer(attackPlayer);

        team.winGame();
    }
}
