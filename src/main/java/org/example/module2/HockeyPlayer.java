package org.example.module2;

public class HockeyPlayer extends Sportsman {

    public HockeyPlayer(String name, String team, int age) {
        super(name, team, age);
    }

    public void scoringWashers() {
        System.out.println("Хоккеист забил шайбу");
    }

    @Override
    public void train() {
        System.out.println("Хоккеист играет в хоккей");
    }

    @Override
    public String toString() {
        return "Хоккеист " + super.toString();
    }

    public void callAll() {
        this.print();
        this.train();
        this.scoringWashers();
        System.out.println();
    }
}
