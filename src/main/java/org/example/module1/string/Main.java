package org.example.module1.string;

public class Main {
    public static void main(String[] args) {
        part1();
        part2();
        part3();
    }
    public static void part1() {
        String[] stringArray = {"ab", "cd", "ef"};
        String tmp = "";
        char[] charArray;

        for (String item: stringArray) {
            tmp = tmp.concat(item);
        }

        charArray = tmp.toCharArray();

        System.out.println("Задание 1");
        System.out.println("Строка: " + tmp);
        for (char item: charArray) {
            System.out.println(item);
        }
        System.out.println("---------- ");
    }

    public static void part2() {
        String stroke = "12345";
        System.out.println("Задание 2");
        System.out.println("Дана строка "+stroke);
        System.out.print("Первый и последний символ: ");
        System.out.println("" + stroke.charAt(0) + stroke.charAt(stroke.length()-1));
        System.out.println("---------- ");
    }

    public static void part3() {
        String str = "1203405";
        System.out.println("Задание 3");
        System.out.println("Дана строка "+str);
        System.out.println("Первый 0 в строке: " + str.indexOf("0"));
        System.out.println("---------- ");
    }
}
