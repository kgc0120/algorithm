package codility;

import java.util.Arrays;

/**
 * @author bumblebee
 *
 * https://app.codility.com/demo/results/trainingGEUX97-XCR/
 */
public class Triangle {

    public static void main(String[] args) {
//        int[] A = {10,2,5,1,8,20};
//        int[] A = {110,50,5,1};
        int[] A = {-110,-50,-5,-1,-10,};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);
        for (int i = 0; i < A.length-2; i++) {
            if(A[i+1] > A[i+2] - A[i]) return 1;
        }
        return 0;

    }

}
