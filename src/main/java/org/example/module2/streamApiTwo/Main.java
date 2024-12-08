package org.example.module2.streamApiTwo;

import org.example.module2.streamApi.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        summNumbers();

        System.out.println();
        distinct();
    }

    private static void summNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(numbers);
        System.out.println("Сумма всех чётных чисел = " + numbers.stream().filter(x -> x % 2 == 0).reduce((x,y)-> x + y).get());
        System.out.println("Сумма всех нечётных чисел = " + numbers.stream().filter(x -> x % 2 == 1).reduce((x,y)-> x + y).get());
    }

    private static void distinct() {
        List<String> products = Arrays.asList("молоко", "мясо", "кефир","молоко", "сосиски", "колбаса", "хлеб", "кефир","конфеты");
        System.out.println(products);
        System.out.println("Убрали дубли\n" + products.stream().distinct().collect(Collectors.toList())
        );
    }
}
