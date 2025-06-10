package linklist.coreconcept;

class Node {
    int data;
    Node next;
    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

public class LinkedListOperation {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        traverseList(head);
        searchKey(head, 20);
        insertAtFront(head, 57);
        insertAtEnd(head, 67);
        insertPos(head, 45, 5);
        deleteAtFront(head);
        deleteLastNode(head);
        deleteNodeAtPos(head, 7);
    }

    public static void traverseList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static boolean searchKey(Node head, int key) {
        while (head != null) {
            if (head.data == key)
                return true;
            head = head.next;
        }
        return false;
    }

    public static Node insertAtFront(Node head, int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        return new_node;
    }

    static Node insertAtEnd(Node head, int newData) {

        Node newNode = new Node(newData);
        if (head == null) {
            return newNode;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return head;
    }

    static Node insertPos(Node head, int pos, int data) {
        if (pos < 1)
            return head;
        if (pos == 1) {
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode;
        }
        Node curr = head;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null)
            return head;
        Node newNode = new Node(data);
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    static Node deleteAtFront(Node head) {
        if (head == null)
            return null;
        Node temp = head;
        head = head.next;
        temp = null;
        return head;
    }

    public static Node deleteLastNode(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        return head;
    }

    public static Node deleteNodeAtPos(Node head, int position) {
        Node temp = head;
        Node prev = null;
        if (temp == null)
            return head;
        if (position == 1) {
            head = temp.next;
            return head;
        }
        for (int i = 1; temp != null && i < position; i++) {
            prev = temp;
            temp = temp.next;
        }
        if (temp != null) {
            prev.next = temp.next;
        } else {
            System.out.println("Data not present");
        }
        return head;
    }

}
