package com.collections.list;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String args[]) {

        List<String> vector = new Vector<>();

        vector.add("Indore");
        vector.add("Shimla");
        vector.add("Bhopal");
        vector.add("Patna");
        vector.add("Dewas");

        System.out.println(vector);
        vector.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(vector);

    }
}
