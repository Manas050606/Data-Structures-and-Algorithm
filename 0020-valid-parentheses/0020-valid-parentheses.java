import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // If it's an opening bracket, push the expected closing bracket
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else {
                // If it's a closing bracket, check for a match
                if (stack.isEmpty() || stack.pop() != ch) {
                    return false;
                }
            }
        }

        // All brackets matched if stack is empty
        return stack.isEmpty();
    }
}