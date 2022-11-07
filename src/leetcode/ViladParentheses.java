package leetcode;

import java.util.Stack;

/**
 * @author bumblebee
 *
 * 20. Valid Parentheses
 */
public class ViladParentheses {

    public static void main(String[] args) {
//        String s = "()[]{}";
        String s = "()[{[()]}]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        if(s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char brackets = s.charAt(i);
            if(stack.isEmpty() && (brackets == '}' || brackets == ')' || brackets == ']')) return false;
            else {
                if (!stack.isEmpty()) {
                    if(brackets == '}' && stack.peek() == '{') stack.pop();
                    else if(brackets == ')' && stack.peek() == '(') stack.pop();
                    else if(brackets == ']' && stack.peek() == '[') stack.pop();
                    else stack.add(brackets);
                }else stack.add(brackets);
            }
        }
        return stack.isEmpty();
    }
}
