package org.example.module2.interfaces;

import org.example.module2.inheritance.Footballer;
import org.example.module2.inheritance.HockeyPlayer;
import org.example.module2.inheritance.Skier;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Иван", 30, true);
        human.fly();
        human.setCrawl(true);
        human.setBreaststroke(true);
        human.swim();
        System.out.println("----------------------");

        Human boy = new Human("Максим", 8);
        boy.fly();
        boy.swim();
        System.out.println("----------------------");

        Fish fish = new Fish("Карась", 1);
        fish.swim();
        System.out.println("----------------------");

        Bird parrot = new Bird("Попугай", 5, true, false);
        parrot.fly();
        parrot.swim();
        System.out.println("----------------------");

        Bird swan = new Bird("Лебедь", 2, true,  true);
        swan.fly();
        swan.swim();
        System.out.println("----------------------");

        Bird penguin = new Bird("Пингвин", 2, false,  true);
        penguin.fly();
        penguin.swim();
        System.out.println("----------------------");

        Bird chicken = new Bird("Курица", 2, false,  false);
        chicken.fly();
        chicken.swim();
    }
}
