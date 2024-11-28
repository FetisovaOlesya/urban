package org.example.module2.inheritance;

public class Skier extends Sportsman {
    public Skier(String name, String team, int age) {
        super(name, team, age);
    }

    public void finish() {
        System.out.println("Лыжник финишировал");
    }

    @Override
    public void train() {
        System.out.println("Лыжник едет на лыжах");
    }

    @Override
    public String toString() {
        return "Лыжник " + super.toString();
    }

    public void callAll() {
        this.print();
        this.train();
        this.finish();
        System.out.println();
    }
}
