package org.example.module2.enumlesson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1. Вернем позицию буквы алфавита");
        System.out.println("a - " + getPositionLetterAlphabet('a'));
        System.out.println("b - " + getPositionLetterAlphabet('b'));
        System.out.println("c - " + getPositionLetterAlphabet('c'));
        System.out.println("P - " + getPositionLetterAlphabet('P'));
        System.out.println("Z - " + getPositionLetterAlphabet('Z'));

        System.out.println("Задание 2");
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Маша", 20, Person.Gender.WOMAN));
        people.add(new Person("Мария Ивановна", 57, Person.Gender.WOMAN));
        people.add(new Person("Петька", 18, Person.Gender.MAN));
        people.add(new Person("Василий Иванович", 40, Person.Gender.MAN));
        people.add(new Person("Аркадий", 67, Person.Gender.MAN));
        people.add(new Person("Максим", 8, Person.Gender.MAN));
        people.add(new Person("Алексей", 6, Person.Gender.MAN));
        people.add(new Person("Екатерина", 4, Person.Gender.WOMAN));
        people.add(new Person("Дмитрий", 37, Person.Gender.MAN));
        people.add(new Person("Есения", 6, Person.Gender.WOMAN));

        System.out.println("-- Женщины -- ");
        ArrayList<Person> woman = getListPersonByGender(people, Person.Gender.WOMAN);
        System.out.println(woman);

        System.out.println("-- Мужчины -- ");
        ArrayList<Person> man = getListPersonByGender(people, Person.Gender.MAN);
        System.out.println(man);

    }

    public static ArrayList<Person> getListPersonByGender(ArrayList<Person> people, Enum<Person.Gender> gender) {
        ArrayList<Person> peopleByGender = new ArrayList<Person>();
        for (int i = 0; i < people.size(); i++ ) {
            if (people.get(i).gender.equals(gender)) {
                peopleByGender.add(people.get(i));
            }
        }
        return peopleByGender;
    }

    public static int getPositionLetterAlphabet(char letter) {
        letter = Character.toUpperCase(letter);
        return Alphabet.valueOf(Character.toString(letter)).ordinal();
    }


    enum Alphabet {
        A('A'),B('B'),C('C'),D('D'),E('E'),F('F'),J('J'),
        H('H'),I('I'),G('G'),K('K'),L('L'),M('M'),N('N'),
        O('O'),P('P'),Q('Q'),R('R'),S('S'),T('T'),U('U'),
        V('V'),W('W'),X('X'),Y('Y'),Z('Z');
        private char letter;

        Alphabet(char letter) {
            this.letter = Character.toUpperCase(letter);
        }

        public char getLetter() {
            return letter;
        }
    }
}
