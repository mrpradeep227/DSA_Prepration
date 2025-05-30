package stack.solutions;
import java.util.Stack;

public class ValidParathensis {
    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (stack.isEmpty() || !isMatching(stack.pop(), ch)) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String s = "{([])}";
        System.out.println(isBalanced(s));
    }
}
