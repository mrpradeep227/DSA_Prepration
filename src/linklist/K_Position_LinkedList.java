package linklist; 
public class K_Position_LinkedList {

    public static Node insertAtKthPosition(Node head, int data, int k) {
        Node newNode = new Node(data);
        Node current = head;
        int position = 0;

        if (k < 0) {
            throw new IllegalArgumentException("K can not be negative");
        }
        if (k == 0) {
            newNode.next = head;
            return newNode;
        }
        while (current != null && position < k - 1) {
            current = current.next;
            position++;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException("Position exceeds linked list length");
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = K_Position_LinkedList.insertAtKthPosition(head, 15, 1);
        head = insertAtKthPosition(head, 5, 0);
        head = insertAtKthPosition(head, 40, 5);

        printList(head);
    }
 
}
   class Node {
    int data;
    Node next;
    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}
