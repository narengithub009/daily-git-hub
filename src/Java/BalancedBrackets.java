package Java;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {

        String str = "{[()]}";

        if (isBalaned(str)) {
            System.out.println("The expression is balanced");
        } else {
            System.out.println("The expression is not balanced...");
        }
    }

    private static boolean isBalaned(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } else if (current == ')' || current == '}' || current == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char popped = stack.pop();
                if ((current == ')' && popped != '(') ||
                        (current == '}' && popped != '{') ||
                        (current == ']' && popped != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
