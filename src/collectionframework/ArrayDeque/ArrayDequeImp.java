package collectionframework.ArrayDeque;

import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeImp {

    public static void main(String[] args) {

        Deque<Integer> d = new ArrayDeque<>();

        d.addFirst(1);
        d.addLast(2);
        d.add(3);
        int f = d.removeFirst();
        int l = d.removeLast();
        System.out.println("First: " + f + ", Last: " + l);

        // Printing initial elements
        System.out.println("Initial Deque: " + d);
        d.offer(10);
        // Removing elements as a stack from top/front
        System.out.println("Initial Deque: " + d);


    }
}


//ArrayDeque (short for Array Double Ended Queue) is a resizable array implementation of the
//Deque interface, which supports insertion and removal at both ends of the queue.
//It is part of the Java Collections Framework and is available in java.util.
//✅ It implements Deque<E>, and thereby Queue<E> and Iterable<E>, but not thread-safe.