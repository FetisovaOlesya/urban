package org.example.module2.enumlesson;

public class Person {
    String name;
    int age;
    Gender gender;

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

    enum Gender {
        MAN("Мужчина"),
        WOMAN("Женщина");
        private String gender;

        Gender(String gender) {
            this.gender = gender;
        }

        public String getType() {
            return gender;
        }
    }
}
