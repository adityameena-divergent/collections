package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Indore");
        list.add("Bhopal");
        list.add("Ujjain");
        list.add("Mumbai");
        list.add("Delhi");
        list.add("Dewas");

        System.out.println(list);

        for(String city: list) {
            System.out.println(city);
        }

        list.forEach((city) -> System.out.println(city));

        Iterator<String> itr = list.listIterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
