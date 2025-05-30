package stack.coreconcept;

public class StackLinkedListImp {
    public static void main(String[] args) {
        {
            Stack st = new Stack();
            st.push(11);
            st.push(22);
            st.push(33);
            st.push(44);
            System.out.println("Top element is " + st.peek());
            System.out.println("Removing two elements...");
            st.pop();
            st.pop();
            System.out.println("Top element is " + st.peek());
        }
    }
}

class Stack {
    Node head;
    Stack() {
        this.head = null;
    }
    // Check if the stack is empty
    boolean isEmpty() {
        return head == null;
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        if (new_node == null) {
            System.out.println("\nStack Overflow");
            return;
        }
        new_node.next = head;
        head = new_node;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("\nStack Underflow");
            return;
        } else {
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }

    int peek() {
        if (!isEmpty())
            return head.data;
        else {
            System.out.println("\nStack is empty");
            return Integer.MIN_VALUE;
        }
    }

}
