package codility;

import java.util.Stack;

/**
 * @author bumblebee
 */
public class Brackets {

    public static void main(String[] args) {
        String s = "{[()()]}";
        System.out.println(solution(s));
    }

    public static int solution(String S) {
        // write your code in Java SE 8

        Stack<Character> stack = new Stack<>();

        if(S.length() % 2 !=0) return 0;

        for (int i = 0; i < S.length(); i++) {
            char bracket = S.charAt(i);
            if(stack.isEmpty() &&(bracket == '}' || bracket == ']' || bracket == ')')) {
                return 0;
            } else {
                if(stack.isEmpty()) {
                    stack.push(bracket);
                }else {
                    if(bracket == '}' && stack.peek() == '{') stack.pop();
                    else if(bracket == ')' && stack.peek() == '(') stack.pop();
                    else if(bracket == ']' && stack.peek() == '[') stack.pop();
                    else stack.push(bracket);
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;

    }
}
