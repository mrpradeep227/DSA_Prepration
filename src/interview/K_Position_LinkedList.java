package interview;

import static interview.Node.K_Position_LinkedList.insertAtKthPosition;
import static interview.Node.K_Position_LinkedList.printList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public class K_Position_LinkedList {

        public static Node insertAtKthPosition(Node head, int data, int k) {

            Node newNode= new Node(data);
            if(k<0){
                throw  new IllegalArgumentException("K can not be negative");
            }
            if(k==0){
                newNode.next=head;
                return newNode;
            }
            // Traverse to (k-1)-th node
            Node current = head;
            int position = 0;

            while (current != null && position < k - 1) {
                current = current.next;
                position++;
            }

            // Case 2: k exceeds list length
            if (current == null) {
                throw new IndexOutOfBoundsException("Position exceeds linked list length");
            }

            // Insert the node
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
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = insertAtKthPosition(head, 15, 1); // between 10 and 20
        head = insertAtKthPosition(head, 5, 0);  // at head
        head = insertAtKthPosition(head, 40, 5); // at end

        printList(head);
    }
}
