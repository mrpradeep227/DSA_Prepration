package queue.coreconcept;
 
// Node class definition
class Node {
    int data;
    Node next;
    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class definition
class Queue {
    private Node front;
    private Node rear;
    public Queue() {
        front = rear = null;
    }

    // Function to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Function to add an element to the queue
    public void enqueue(int new_data) {
        Node new_node = new Node(new_data);
        if (isEmpty()) {
            front = rear = new_node;
            printQueue();
            return;
        }
        rear.next = new_node;
        rear = new_node;
        printQueue();
    }

    // Function to remove an element from the queue
    public void dequeue() {
        if (isEmpty()) {
            return;
        }
        Node temp = front;
        front = front.next;
        if (front == null) rear = null;
        temp = null;
        printQueue();
    }

    // Function to print the current state of the queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.print("Current Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Driver code to test the queue implementation
public class queuelinkedlistImp {
    public static void main(String[] args) {
        Queue q = new Queue();

        // Enqueue elements into the queue
        q.enqueue(10);
        q.enqueue(20);

        // Dequeue elements from the queue
        q.dequeue();
        q.dequeue();

        // Enqueue more elements into the queue
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        // Dequeue an element from the queue (this should print 30)
        q.dequeue();
    }
}