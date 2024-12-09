package org.example.module2.enumlesson;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender.getType() +
                "}\n";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    enum Gender {
        MAN("Мужчина"),
        WOMAN("Женщина");

        public String getGender() {
            return gender;
        }

        private String gender;

        Gender(String gender) {
            this.gender = gender;
        }

        public String getType() {
            return gender;
        }
    }
}
