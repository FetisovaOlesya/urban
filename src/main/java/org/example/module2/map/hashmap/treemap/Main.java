package org.example.module2.map.hashmap.treemap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("------ Задание 1 ------");
        task1();
        System.out.println("------ Задание 2 ------");
        task2();
    }

    public static void task1() {
        ArrayList<Integer> keys;
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "blue");
        hashMap.put(3, "yellow");
        hashMap.put(8, "green");
        hashMap.put(7, "red");
        hashMap.put(11, "pink");
        System.out.println(hashMap);

        keys = getKeys(hashMap);
        System.out.println(keys);


    }

    public static ArrayList<Integer> getKeys(HashMap<Integer, String> hashMap) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
            list.add(entry.getKey());
        }
        return list;
    }

    public static void task2() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(4, "four");
        hashMap.put(0, "zero");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(1, "one");
        hashMap.put(5, "five");
        System.out.println(hashMap);
        System.out.println(getAssocListAndValueMoreThree(hashMap));
    }

    public static HashMap<Integer, String> getAssocListAndValueMoreThree(HashMap<Integer, String> hashMap) {
        HashMap<Integer, String> newHashMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
            if (entry.getValue().length() > 3) {
                newHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return newHashMap;
    }
}
