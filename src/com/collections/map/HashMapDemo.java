package com.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();

        map.put(15, 1000);
        map.put(25, 2000);
        map.put(37, 3000);
        map.put(41, 4000);
        map.put(54, 5000);

        map.forEach((key, value) -> System.out.println(key + " = " + value));
        System.out.println(map);

    }
}
