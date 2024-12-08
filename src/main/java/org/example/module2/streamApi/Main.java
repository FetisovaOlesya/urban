package org.example.module2.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("---- Поиск продуктов по первой буке к ---");
        findProductsByChar();

        System.out.println();
        System.out.println("---- Поиск персон, старше 30 лет ---");
        printPersonsOlderThirtyYearsOld();

    }

    private static void findProductsByChar() {
        List<String> products = Arrays.asList("молоко", "мясо", "кефир","клубника", "сосиски", "колбаса", "хлеб", "кефир","конфеты");
        System.out.println(products);
        System.out.println("Продуктов на букву к: " + products.stream().
                                                                distinct().
                                                                filter(s -> s.charAt(0) == 'к').
                                                                count());
    }

    public static void printPersonsOlderThirtyYearsOld() {
        ArrayList<Person> persons = getListPerson();
        persons.stream().filter(person -> person.age > 30).forEach(System.out::println);

    }

    public static ArrayList<Person> getListPerson() {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Маша", 20));
        persons.add(new Person("Мария Ивановна", 57));
        persons.add(new Person("Петька", 18));
        persons.add(new Person("Василий Иванович", 40));
        persons.add(new Person("Аркадий", 67));
        persons.add(new Person("Максим", 8));
        persons.add(new Person("Алексей", 6));
        persons.add(new Person("Екатерина", 4));
        persons.add(new Person("Дмитрий", 37));
        persons.add(new Person("Есения", 6));

        return persons;
    }
}
