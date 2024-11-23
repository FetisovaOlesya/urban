package org.example;

import org.example.module2.Footballer;
import org.example.module2.HockeyPlayer;
import org.example.module2.Skier;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------- Вариант 1 ----------");
        varian1();
        System.out.println("--------- Вариант 2 ----------");
        varian2();
    }

    public static void varian2() {
        Footballer footballerOne = new Footballer("Андрей Аршавин", "Зенит", 43);
        Footballer footballerTwo = new Footballer("Александр Кержаков", "Зенит", 41);

        footballerOne.callAll();
        footballerTwo.callAll();

        HockeyPlayer hocheyPlayerOne = new HockeyPlayer("Алексей Мельничук", "Локомотив", 26);
        HockeyPlayer hocheyPlayerTwo = new HockeyPlayer("Валерий Харламов", "ЦСКА", 41);

        hocheyPlayerOne.callAll();
        hocheyPlayerTwo.callAll();

        Skier skierOne= new Skier("Александр Большунов", "Сборная России", 29);
        Skier skierTwo = new Skier("Симоне Оригоне", "Сборная Италии", 26);

        skierOne.callAll();
        skierTwo.callAll();
    }
    /**
     * Можно сделать так, но много кода в одном методе
     */
    public static void varian1() {
        Footballer footballerOne = new Footballer("Андрей Аршавин", "Зенит", 43);
        Footballer footballerTwo = new Footballer("Александр Кержаков", "Зенит", 41);

        footballerOne.print();
        footballerOne.train();
        footballerOne.scoringGoals();
        System.out.println();

        footballerTwo.print();
        footballerTwo.train();
        footballerTwo.scoringGoals();
        System.out.println();

        HockeyPlayer hocheyPlayerOne = new HockeyPlayer("Алексей Мельничук", "Локомотив", 26);
        HockeyPlayer hocheyPlayerTwo = new HockeyPlayer("Валерий Харламов", "ЦСКА", 41);

        hocheyPlayerOne.print();
        hocheyPlayerOne.train();
        hocheyPlayerOne.scoringWashers();
        System.out.println();

        hocheyPlayerTwo.print();
        hocheyPlayerTwo.train();
        hocheyPlayerTwo.scoringWashers();
        System.out.println();

        Skier skierOne= new Skier("Александр Большунов", "Сборная России", 29);
        Skier skierTwo = new Skier("Симоне Оригоне", "Сборная Италии", 26);

        skierOne.print();
        skierOne.train();
        skierOne.finish();
        System.out.println();

        skierTwo.print();
        skierTwo.train();
        skierTwo.finish();
        System.out.println();
    }

//    public static void game() {
//        Gamer[] gamers = new Gamer[5];
//        int[] apples = new int[3];
//        gamers[0] = new Gamer("Иван", true);
//        gamers[1] = new Gamer("Ольга", false);
//        gamers[2] = new Gamer("Степан", true);
//        gamers[3] = new Gamer("Петр", true);
//        gamers[4] = new Gamer("Анна", false);
//        System.out.println("Находятся в игре:");
//        for (int i=0; i < gamers.length; i++) {
//            if(gamers[i].isActive()) {
//                System.out.println(gamers[i].getNickname().length());
//            }
//        }
//    }
}
