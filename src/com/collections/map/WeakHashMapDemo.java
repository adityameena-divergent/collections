package com.collections.map;

import java.util.InputMismatchException;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) {

        WeakHashMap<Integer, Integer> map = new WeakHashMap<>();

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(20);

        map.put(i1, 1000);
        map.put(i2, 2000);
        map.put(30, 3000);
        System.out.println(map);

        i1 = null;
        System.gc();
        System.out.println(map);

        i2 = null;
        System.gc();
        System.out.println(map);

    }
}
