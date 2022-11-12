package codility;

import java.util.Arrays;

/**
 * @author bumblebee
 */
public class NailingPlanks {

    public static void main(String[] args) {

        int[] A = {1,4,5,8};
        int[] B = {4,5,9,10};
        int[] C = {4,6,7,10,2};
        System.out.println(solution(A,B,C));
    }

    public static int solution(int[] A, int[] B, int[] C) {
        // write your code in Java SE 8

        boolean[] check = new boolean[C.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < C.length; j++) {
                if(A[i] <= C[j] && C[j] <= B[i]) {
                    check[i] = true;
                    break;
                }
            }
        }
        int res = 0;
        for (boolean b : check) {
            if(b) res++;
        }
        return (res == 0) ? -1 : res;

    }
}
