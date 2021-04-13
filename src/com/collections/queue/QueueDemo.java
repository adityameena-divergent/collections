package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        q.add("Tesla");
        q.add("Tata");
        q.add("SSC");
        q.add("Land Rover");
        q.add("lamborghini");

        Stream<String> q1 = q.stream().filter((element) -> element.length() > 4);
        System.out.println(q1.count());

        System.out.println(q);
        q.remove();
        q.remove();
        System.out.println(q);


    }
}
