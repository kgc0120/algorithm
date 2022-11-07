package codility;

import java.util.Stack;

/**
 * @author bumblebee
 *
 * https://app.codility.com/demo/results/trainingHZNU6F-NAF/
 */
public class Fish {

    public static void main(String[] args) {
        int[] A = {4,3,2,1,5,2,4};
        int[] B = {0,1,0,0,1,0,0};
        System.out.println(solution(A,B));
    }

    public static int solution2(int[] A, int[] B) {
        // write your code in Java SE 8

        Stack<Integer> stack = new Stack();
        stack.push(A.length-1);
        for (int i = A.length-2; i >= 0; i--) {
            if(B[i] != B[stack.peek()]) {
                if(A[i] < A[stack.peek()]) {
                    break;
                }else {
                    while(!stack.isEmpty() && A[stack.peek()] < A[i]) {
                        stack.pop();
                    }
                    stack.push(i);
                }
            } else{
                stack.push(i);
            }
        }
        return stack.size();
    }

    public static int solution(int[] A, int[] B) {
        // write your code in Java SE 8

        Stack<Integer> stack = new Stack();
        int downFish = 0;
        for (int i = A.length-1; i >= 0; i--) {
            if(B[i] == 0) {
                stack.push(A[i]);
            }else {
                while(!stack.isEmpty() && stack.peek() < A[i]) {
                    stack.pop();
                }
                if(stack.isEmpty()) downFish++;
            }
        }
        return stack.size() + downFish;
    }
}
