package com.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(25);
        list.add(45);
        list.add(88);
        list.add(94);
        System.out.println(list);
        list.add(2, 500);
        System.out.println(list);
        list.set(2, 1000);
        System.out.println(list);
    }
}
