package org.example.module2.collections.set;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("--------- задание 1 ----------");
        useSetHash();
        System.out.println("--------- задание 2 ----------");
        useLinkedHashSet();
    }

    public static void useSetHash() {
        HashSet<String> colorPepper = new HashSet<String>();
        HashSet<String> colorBazil = new HashSet<String>();
        colorPepper.add("green");
        colorPepper.add("yellow");
        colorPepper.add("red");
        colorPepper.add("orange");
        colorPepper.add("violet");

        colorBazil.add("green");
        colorBazil.add("violet");
        colorBazil.add("black");
        colorBazil.add("light green");

        System.out.println("----------- Цвета перца ---------------");
        System.out.println(colorPepper);
        System.out.println("---------- Цвета базилика -------------");
        System.out.println(colorBazil);
        System.out.println(equalsColors(colorPepper, colorBazil));
    }

    public static HashSet<String> equalsColors(HashSet<String> one, HashSet<String> two) {
        HashSet<String> result = new HashSet<String>();
        Iterator<String> itOne = one.iterator();
        String color;

        while (itOne.hasNext()) {
            color = itOne.next();
            if (two.contains(color)) {
                result.add(color);
            }
        }
        return result;
    }

    public static void useLinkedHashSet() {
        HashSet<Integer> setNumbers = new HashSet<Integer>();
        HashSet<Integer> resultOne = new HashSet<Integer>();
        TreeSet<Integer> resultTwo = new TreeSet<Integer>();
        HashSet<Integer> resultThree = new HashSet<Integer>();
        Integer number;

        setNumbers.add(8);
        setNumbers.add(14);
        for (int i=20; i>=0; i--) {
            setNumbers.add(i);
        }
        System.out.println(setNumbers);
        Iterator<Integer> itOne = setNumbers.iterator();
        while (itOne.hasNext()) {
            number = itOne.next();
            if (number > 15 && number % 2 == 0) {
                resultOne.add(number);
            } else {
                System.out.print(number/2 + ", ");
                resultTwo.add(number/2);
            }
        }
        System.out.println();
        System.out.println("1: " + resultOne);
        System.out.println("2: " + resultTwo);
    }
}
