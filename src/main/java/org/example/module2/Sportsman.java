package org.example.module2;

public abstract class Sportsman {
    private String name;
    private String team;
    private int age;

    public Sportsman(String name, String team, int age) {
        this.name = name;
        this.team = team;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }

    public void train() {
        System.out.println("Спортсмен тренируется");
    }



    public String toString() {
        return  "{" +
                "name='" + this.getName() + '\'' +
                ", team='" + this.getTeam() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }

    public void print() {
        System.out.println(this.toString());
    }

    public void callAll() {
        this.print();
        this.train();
        System.out.println();
    }

}
