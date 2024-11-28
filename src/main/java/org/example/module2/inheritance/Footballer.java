package org.example.module2.inheritance;

public class Footballer extends Sportsman {


    public Footballer(String name, String team, int age) {
        super(name, team, age);
    }

    public void scoringGoals() {
        System.out.println("Футболист забил гол");
    }

    @Override
    public void train() {
        System.out.println("Футболист играет в футбол");
    }

    @Override
    public String toString() {
        return "Футболист " + super.toString();
    }

    @Override
    public void callAll() {
        this.print();
        this.train();
        this.scoringGoals();
        System.out.println();
    }
}
