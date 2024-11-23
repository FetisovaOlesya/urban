package org.example;

public class ClassMembersConstructorsMethods {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double a = 32, b = 5;

        double sum = calc.add(a, b);
        double sub = calc.sub(a, b);
        System.out.println("Результат сложения: " + sum);
        System.out.println("Результат вычитания: " + sub);

        calc.multi(a, b);
        calc.div(a, b);
    }
}
