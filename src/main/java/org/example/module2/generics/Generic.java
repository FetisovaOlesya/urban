package org.example.module2.generics;

public class Generic<T, V> {

    public static <T, V> boolean isEqualsArray(T[] arrOne, T[] arrTwo) {
        if (arrOne.getClass() != arrTwo.getClass()) {
            System.out.println("Массивы разных типов!");
            return false;
        }
        if (arrOne.length != arrTwo.length) {
            System.out.println("Массивы не равны по длине!");
            return false;
        }

        for (int i=0; i < arrOne.length; i++) {
            if (!arrOne[i].equals(arrTwo[i])) {
                return false;
            }
        }
        return true;
    }

    public static <T> T[] changePositionInArray(T[] array, int positionOne, int positionTwo) throws Exception {
        if (positionOne <0 || positionOne >= array.length) {
            throw new Exception("positionOne за рамками возможного диапазона");
        }
        if (positionTwo <0 || positionTwo >= array.length) {
            throw new Exception("positionTwo за рамками возможного диапазона");
        }

        T tmp = array[positionOne];
        array[positionOne] = array[positionTwo];
        array[positionTwo] = tmp;
        return array;
    }


}
