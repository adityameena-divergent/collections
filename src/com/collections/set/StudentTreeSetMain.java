package com.collections.set;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class StudentTreeSetMain {

    public static void main(String[] args) {

        Set<Student> set = new TreeSet<>((Student o1, Student o2) -> o1.id - o2.id);

        set.add(new Student("Anil", 101));
        set.add(new Student("Abhishek", 107));
        set.add(new Student("Jayant", 104));
        set.add(new Student("Conner", 109));
        set.add(new Student("Ajax", 102));

        System.out.println(set);

    }

}
