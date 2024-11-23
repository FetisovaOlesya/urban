package org.example;

public class Main {
    public static void main(String[] args) {
        Gamer[] gamers = new Gamer[5];
        int[] apples = new int[3];
        gamers[0] = new Gamer("Иван", true);
        gamers[1] = new Gamer("Ольга", false);
        gamers[2] = new Gamer("Степан", true);
        gamers[3] = new Gamer("Петр", true);
        gamers[4] = new Gamer("Анна", false);
        System.out.println("Находятся в игре:");
        for (int i=0; i < gamers.length; i++) {
            if(gamers[i].isActive()) {
                System.out.println(gamers[i].getNickname());
            }
        }
    }
}
