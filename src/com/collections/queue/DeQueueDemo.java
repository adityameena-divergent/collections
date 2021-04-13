package com.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DeQueueDemo {
    public static void main(String[] args) {

        Deque<Integer> q = new ArrayDeque<>();
        q.add(2);
        q.add(7);
        q.add(5);
        q.add(4);
        System.out.println(q);

        q.addFirst(100);
        q.addLast(200);
        System.out.println(q);

        Iterator<Integer> itr = q.descendingIterator();

        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }
}
