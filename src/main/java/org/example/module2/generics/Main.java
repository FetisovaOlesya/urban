package org.example.module2.generics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Integer[] arrOne= {1,3,5,7,9};
        Integer[] arrTwo = {0,2,4,6,8};
        printForEqualsArray(arrOne, arrTwo);

        Integer[] arrThree= {1,3,5,7,9};
        Integer[] arrFour = {1,3,5,7,9};
        printForEqualsArray(arrThree, arrFour);

        Double[] arrDouble= {1.0,3.2,5.5,7.4,9.3};
        Integer[] arrInteger = {1,3,5,7,9,10};
        printForEqualsArray(arrDouble, arrInteger);

        Integer[] arrIntegerOne= {1,3,5,7,9,10};
        Integer[] arrIntegerTwo = {1,3,5,7,9,10,11};
        printForEqualsArray(arrIntegerOne, arrIntegerTwo);

        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("-------- Меняем позиции 2 и 5 ------------");
        Generic<Integer,Integer> generic = new Generic<>();
        System.out.println(Arrays.toString(arrIntegerTwo));
        arrIntegerTwo = generic.changePositionInArray(arrIntegerTwo, 2,5);
        System.out.println(Arrays.toString(arrIntegerTwo));

        System.out.println("-------- Меняем позиции 0 и 6 ------------");
        arrIntegerTwo = generic.changePositionInArray(arrIntegerTwo, 0,6);
        System.out.println(Arrays.toString(arrIntegerTwo));

        System.out.println("-------- Проверяем выход за диапазон ------------");
        try {
            arrIntegerTwo = generic.changePositionInArray(arrIntegerTwo, -1, 6);
            System.out.println(Arrays.toString(arrIntegerTwo));
        }catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }

    /**
     * Создала этот метод printForEqualsArray, чтоб уменьшить код в методе main
     *
     */
    public static void printForEqualsArray(Number[] arrOne, Number[] arrTwo) {
        Generic<Integer,Integer> generic = new Generic<>(); //данный объект generic будет создаваться при каждом вызове метода printForEqualsArray
        //что лучше сделать в java, чтобы этого избежать? можно передавать generic третьим параметром, но интуитивно не нравится такое решение
        System.out.println(Arrays.toString(arrOne));
        System.out.println(Arrays.toString(arrTwo));
        System.out.println("Массивы равны: " + generic.isEqualsArray(arrOne, arrTwo));
    }
}
