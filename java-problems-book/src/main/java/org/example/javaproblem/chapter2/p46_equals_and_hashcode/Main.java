package org.example.javaproblem.chapter2.p46_equals_and_hashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String... args) {
        Player player1 = new Player(1, "Max Dok");
        Player player2 = new Player(1, "Max Dok");

        System.out.println("player1.equals(player2) = " + player1.equals(player2));

        System.out.println("player 1.hashCode() = " + player1.hashCode());
        System.out.println("player 2.hashCode() = " + player2.hashCode());

        System.out.println("==============================================");

        Set<Player> players = new HashSet<>();
        players.add(player1);
        players.add(player2);
        System.out.println(players.size());

        System.out.println("players.contains Player = " + players.contains(new Player(1, "Max Dok")));

        //Arrays.hashCode(player1, player2);
    }
}
