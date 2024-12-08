package org.example.module1;

public class JavaIfSwitchReturn {
    public static void main(String[] args) {
        part1();
        part2();
    }

    public static void part1() {
        int a = 8;
        int b = 4;
        if ((a % 2 == 0 && b % 2 == 0) || ((a % 2 !=0 && b % 2 !=0))) {
                System.out.println("Удачное совпадение");
        }
    }

    public static void part2() {
        int day = 3;
        if (day >=1 && day <= 10){
            System.out.println("Первая декада");
        } else if (day >=11 && day <=20) {
            System.out.println("Вторая декада");
        }else if (day >=21 && day <=31) {
            System.out.println("Третья декада");
        }
    }
}
