package org.example;

public class WhileDoWhileForBreakContinue {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        part1();
        System.out.println("Задание 2");
        part2();
    }

    public static void part1() {
        int i = 1;
        System.out.println("Кратны 3");
        while (i <= 50) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void part2() {
        int sum = 0;
        int i;

        for (i = 1; i <= 100; i++ ) {
            sum += i;
        }

        System.out.print("Сумма чисел от 1 до 100 = ");
        System.out.println(sum);
    }
}