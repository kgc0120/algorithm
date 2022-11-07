package codility;

import java.util.Stack;

/**
 * @author bumblebee
 *
 * https://app.codility.com/demo/results/trainingFZ6EME-RTB/
 */
public class Nesting {


    public static void main(String[] args) {
        String S = "(()(())())";
        System.out.println(solution(S));
    }

    public static int solution(String S) {
        // write your code in Java SE 8

        if(S.length() % 2 !=0) return 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char bracket = S.charAt(i);

            if(stack.isEmpty() && bracket ==')') {
                return 0;
            }else {
                if(stack.isEmpty()) {
                    stack.push(bracket);
                }else{
                    if(bracket ==')' && stack.peek() == '(') stack.pop();
                    else stack.push(bracket);
                }
            }

        }
        return stack.isEmpty() ? 1 : 0;

    }
}
