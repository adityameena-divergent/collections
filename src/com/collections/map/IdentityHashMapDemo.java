package com.collections.map;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        IdentityHashMap<Integer, Integer> map = new IdentityHashMap<>();

        map.put(10, 1000);
        map.put(20, 2000);
        map.put(new Integer(10), 3000);

        System.out.println(map);

        System.out.println(map.get(10));

    }
}
