package com.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<>();

        q.add(10);
        q.add(6);
        q.add(2);
        q.add(8);
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);

        q.forEach((element) -> System.out.print(element + " "));

    }
}
