package org.example.module2.interfaces;

public class Bird extends LivingOrganism implements Swimmable, Flyable {
    private boolean isWaterfowl;
    private boolean isFly;

    public Bird(String name, int age, boolean isFly, boolean isWaterfowl) {
        super(name, age);
        this.isFly = isFly;
        this.isWaterfowl = isWaterfowl;
    }

    @Override
    public void fly() {
        if (isFly) {
            System.out.println(super.getName() + " отлично летает");
        } else {
            System.out.println(super.getName() + " не умеет летать");
        }
    }

    @Override
    public void swim() {
        if (isWaterfowl) {
            System.out.println(this.getName() + " умеет плавать с помощью перепонок на лапках.");
        } else {
            System.out.println(this.getName() + " не умеет плавать");
        }
    }
}
