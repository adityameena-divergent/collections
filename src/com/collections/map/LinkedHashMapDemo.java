package com.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        map.put(5, 1000);
        map.put(2, 2000);
        map.put(7, 3000);
        map.put(6, 4000);
        map.put(1, 5000);

        System.out.println(map);
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue(2000));
        System.out.println(map.keySet());
        System.out.println();

    }
}
