package org.example.module2.interfaces;

public abstract class LivingOrganism {
    private String name;
    private int age;

    public LivingOrganism(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
