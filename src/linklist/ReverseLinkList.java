package linklist;

public class ReverseLinkList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(10);
        System.out.println("Original Linklist :");
        printLinkList(head);
        head = reverseLinkList(head);
        System.out.println("Reversed Linklist:");
        printLinkList(head);
    }

    static void printLinkList(Node node) {
        while (node != null) {
            System.out.println(" " + node.data);
            node = node.next;
        }
    }

    static Node reverseLinkList(Node head) {
        Node curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
