package codility;

/**
 * @author bumblebee
 *
 * 다이나믹 프로그래밍(카데인 알고리즘)
 * https://app.codility.com/demo/results/training537H5P-ZWF/
 *
 */
public class MaxSliceSum {

    public static void main(String[] args) {
        int[] A = {3,2,-6,4,10};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length == 1) return A[0];

        int localMax = A[0];
        int globalMax = A[0];
        for (int i = 1; i < A.length; i++) {
            localMax = Math.max(A[i], localMax + A[i]);
            globalMax = Math.max(globalMax, localMax);

        }
        return globalMax;
    }
//  TIME OUT
    public static int solution2(int[] A) {
        // write your code in Java SE 8
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            maxNum = Math.max(maxNum, A[i]);
            int sum = A[i];
            for (int j = i+1; j < A.length; j++) {
                sum += A[j];
                if(maxNum < sum) maxNum = sum;
            }
        }
        return maxNum;
    }





}
