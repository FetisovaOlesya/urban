package org.example.module2.lambda;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        sumOfEven();
        System.out.println();
        System.out.println();
        findMaxLongWord();
    }


    public static void findMaxLongWord(){
        ArrayList<String> listString = new ArrayList<String>();
        listString.add("мясо");
        listString.add("холодильник");
        listString.add("синхрофазатрон");
        listString.add("солнышко");

        System.out.println(listString);

        Finder finder = (ArrayList<String> arrayList) -> {
            String maxStroke = arrayList.get(0).toString();
            for (int i = 1; i < arrayList.size(); i++) {
                if ( maxStroke.length() < arrayList.get(i).toString().length()) {
                    maxStroke = arrayList.get(i).toString();
                }
            }
            return maxStroke;
        };

        System.out.println("Самое длинное слово: " + finder.find(listString));
    }

    public static void sumOfEven() {

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        Sum sum = (ArrayList<Integer> arrayList) -> {
            int result = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) % 2 == 0) {
                    result += arrayList.get(i);
                }
            }
            return result;
        };

        System.out.println("Сумма четных элементов списка: " + sum.calculate(list));
    }
}

interface Sum {
    int calculate(ArrayList<Integer> arrayList);
}

interface Finder {
    String find(ArrayList<String> arrayList);
}