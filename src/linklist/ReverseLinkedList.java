package linklist;

import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = null, tail = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " node values:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        System.out.println("Original LinkList:");
        printList(head);
        head = reverseLinkList(head);
        System.out.println("Reverese LinkList:");
        printList(head);
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    static Node reverseLinkList(Node head) {
        Node curr = head, prev = null, next ;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
