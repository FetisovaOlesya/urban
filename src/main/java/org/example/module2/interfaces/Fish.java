package org.example.module2.interfaces;

public class Fish extends LivingOrganism implements Swimmable {


    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " плавает с помощью плавников.");

    }
}
