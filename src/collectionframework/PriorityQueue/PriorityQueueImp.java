package collectionframework.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueImp {
    public static void main(String[] args) {
        // Priority Queue Min Type
        PriorityQueue<Integer> p = new PriorityQueue<>();

        // Add elements to the queue
        p.add(3);
        p.add(10);
        p.add(7);
        p.add(2);
        // Printing the top element of PriorityQueue
        System.out.println(p.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(p.poll());

        // Printing the top element again
        System.out.println(p.peek());

        // Print the head of the queue
        System.out.println("Head of Queue: " + p.peek());
    }
}
