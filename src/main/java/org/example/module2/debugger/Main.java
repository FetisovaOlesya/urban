package org.example.module2.debugger;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("------ Задание 1 ------");
        task1();
        System.out.println("------ Задание 2 ------");
        task2();
    }

    public static void task1() {
        int[] array = new int[10];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max = " + max);
    }

    public static void task2() {
        String text = "Привет, Александр, с праздником, с Новым Годом";
        System.out.println(text);
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ( (int)chars[i] == Character.toUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        System.out.println(chars);
    }
}
