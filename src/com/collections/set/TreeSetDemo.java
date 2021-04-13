package com.collections.set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>((o1, o2) -> o1.length() > o2.length() ? 1:-1);

        set.add("Aditya");
        set.add("Abhishek");
        set.add("Ram");
        set.add("Raman");
        set.add("Aman");
        System.out.println(set);
        System.out.println(set.ceiling("R"));
        System.out.println(set.floor("Aman"));
        System.out.println(set.contains("Aditya"));
        System.out.println(set.size());
        set.forEach(System.out::print);
    }
}
