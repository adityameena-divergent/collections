package com.collections.map;

import com.collections.set.Employee;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        Map<Employee, Integer> employee = new TreeMap<>();
        employee.put(new Employee("bbb", 101), 1001);
        employee.put(new Employee("aaa", 102), 1002);
        employee.put(new Employee("ddd", 103), 1003);
        employee.put(new Employee("ccc", 104), 1004);

        System.out.println(employee);

        employee.forEach((key, value) -> System.out.println(key + " = " + value));

    }

}
