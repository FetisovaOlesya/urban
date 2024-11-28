package org.example.module2.interfaces;

public class Human extends LivingOrganism implements Swimmable, Flyable {
    private boolean isWaterfowl = false;
    private boolean isCrawl = false; //умеет плавать кролем
    private boolean isBreaststroke = false; //умеет плавать брассом

    public Human(String name, int age) {
        super(name, age);
    }
    public Human(String name, int age,  boolean isWaterfowl) {
        super(name, age);
        this.isWaterfowl = isWaterfowl;
    }

    public void setCrawl(boolean crawl) {
        isCrawl = crawl;
    }

    public void setBreaststroke(boolean breaststroke) {
        isBreaststroke = breaststroke;
    }

    @Override
    public void fly() {
        if (this.getAge() >= Flyable.PARAGLIDER ) {
            System.out.println(this.getName() + " может летать на пароплане");
        } else {
            System.out.println(this.getName() + " не может летать на пароплане");
        }
    }

    @Override
    public void swim() {
        if (!this.isWaterfowl) {
            System.out.println(this.getName() + " не умеет плавать.");
            return;
        }

        if (this.isCrawl) {
            System.out.println(this.getName() + " умеет плавать кролем.");
        }
        if (this.isBreaststroke) {
            System.out.println(this.getName() + " умеет плавать брассом.");
        }
    }
}

