package com.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Perl");
        set.add("C");
        set.add("Objective C");

        System.out.println(set.add("Swift"));
        System.out.println(set.add("Java"));
        System.out.println(set.contains("C"));
        System.out.println(set);

        Iterator<String> itr = set.iterator();

        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }
}
