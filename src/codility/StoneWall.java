package codility;

import java.util.Stack;

/**
 * @author bumblebee
 */
public class StoneWall {

    public static void main(String[] args) {
        int[] H = {8,8,5,7,9,8,7,4,8};
        System.out.println(solution(H));
    }

    // 이전보다 크면 cnt 증가, push
    // 이전보다 작아질때까지 pop
    public static int solution(int[] H) {
        // write your code in Java SE 8
        int cnt =0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < H.length; i++) {
            while(!stack.isEmpty() && stack.peek() > H[i]) {
                stack.pop();
            }
            if(stack.isEmpty() || stack.peek() < H[i]) {
                stack.push(H[i]);
                cnt++;
            }
        }
        return cnt;
    }
}
