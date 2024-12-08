package org.example.module1;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        part1();
        System.out.println("Задание 2");
        part2();
        System.out.println("Задание 3");
        part3();
    }

    public static void part1() {
        int[] array = {3, 87, 12, 98, 2, 4, 66};
        for (int i = array.length-1; i>=0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void part2() {
        double[] array = {6.1, 117.4, 44.8, 5.3, 32.6, 81.8, 9};
        double temp;

        for(int i = 0; i < array.length; i++) {
            for(int j =0; j < array.length-1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void part3() {
        int[] array = {6, 117, 44, 5, 32, 81, 9};
        for (int i=0; i<array.length; i++) {
           if (array[i] % 2 == 0) {
               System.out.println(array[i]);
            }
        }
    }
}