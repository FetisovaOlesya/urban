package org.example.module2.exception;

public class Main {
    public static void main(String[] args) {
        example1();
        example2();
    }
    public static void example1() {
        System.out.println("Задание 1");
        int[] numbers = {2,15,48,33,105,86,99};

        class Check {
            public void isOdd(int num) {
                try {
                    if (num % 2 == 1) {
                        throw new Exception("Обнаружено нечетное число");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage() + ": "+ num);
                }
            }
        }

        Check check = new Check();
        for (int number: numbers) {
            check.isOdd(number);
        }

        System.out.println("---------- ");
    }

    public static void example2() {
        System.out.println("Задание 2");

        class Check {
            public void isContaintsNumber(String string) {
                int code;
                char simbol;
                for (int i=0; i < string.length(); i++) {
                    simbol = string.charAt(i);
                    code = (int)simbol;
                    try {
                        if (code >= (int)'0' && code <= (int)'9') {
                            throw new Exception("Строка содержит числа");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage() + ": "+ string);
//                        System.out.println("finally не отработает?");
                        break;
                    }
//                    finally {
//                        System.out.println("Отработало на шаге " + i + ", проверяемый символ " + simbol);
//                    }
                }
            }
        }

        Check check = new Check();
        check.isContaintsNumber("За4дание 2");
        check.isContaintsNumber("Тут нет чисел");
        check.isContaintsNumber("В этой строке есть 3 числа. Второе равно 4, Третье 6.");
        check.isContaintsNumber("2 бублика");
    }
}
