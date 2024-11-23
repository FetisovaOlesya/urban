package org.example;

public class Calculator {
    public double a;
    public double b;

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public void multi(double a, double b) {
        double result = a * b;
        System.out.println("Результат умножения: "+ result );
    }
    public void div(double a, double b) {
        double result = a / b;
        System.out.println("Результат деления: " + result );
    }
}
