package org.example;

public class DataTypes {
    public static void main(String[] args) {
        part1();
        part2();
        part3();
    }

    public static void part1() {
        int a = 10;
        double b = 3;
        char c = 'h';
        double result = a + b + c;

        System.out.println("Задание 1");
        System.out.println("c = '" + c + "' = " + (int) c);
        System.out.println("result = "+ result);
    }

    public static void part2() {
        int a = 5;
        int b = 12;
        boolean check = a > b;

        System.out.println("Задание 2");
        System.out.print(a + " > " + b + " = ");
        System.out.println(check);
    }

    public static void part3() {
        int a = 6;
        double result;

        result = (a + 6 - 2)/5*7;

        System.out.println("Задание 3");
        System.out.print("result: " + result);
    }
}