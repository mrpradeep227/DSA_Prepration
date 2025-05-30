package stack.solutions;

import java.util.*;

public class NextGreaterElement {

    public static List<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        Integer[] result = new Integer[arr.length];

        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // Remove all smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            // Assign next greater or -1
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        return Arrays.asList(result);
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        nextLargerElement(arr).forEach(x -> System.out.print(x + " "));
    }
}
