package org.example.module2.collections;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("--------- задание 1 ----------");
        useArrayList();
        System.out.println("--------- задание 2 ----------");
        useLinkedList();
    }

    public static void useLinkedList() {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(9);
        for(int i=1; i<9; i++) {
            numbers.add(i);
        }
        numbers.add(0);
        System.out.println(numbers);
        numbers = changeElements(numbers);
        System.out.println(numbers);

    }

    public static LinkedList<Integer> changeElements(LinkedList<Integer> numbers) {
        Integer first = numbers.getFirst();
        Integer last = numbers.getLast();
        numbers.removeFirst();
        numbers.addFirst(last);
        numbers.removeLast();
        numbers.addLast(first);
        return numbers;
    }



    public static void useArrayList() {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("white");
        colors.add("black");
        System.out.println(colors);
        System.out.println("is black: "  + isColor(colors, "black"));
        System.out.println("is pink: "  + isColor(colors, "pink"));
        colors.add("pink");
        colors.add("blue");
        colors.add("red");
        System.out.println(colors);
        System.out.println("is pink: "  + isColor(colors, "pink"));
        System.out.println("is red: "  + isColor(colors, "red"));
        colors.remove("black");
        System.out.println(colors);
        System.out.println("is black: "  + isColor(colors, "black"));
    }

    public static boolean isColor(ArrayList<String> listColors, String color) {
        for (String item: listColors) {
            if (item.equals(color)) {
                return true;
            }
        }
        return false;
    }


}
