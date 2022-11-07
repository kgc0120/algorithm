package leetcode.dynamic_programming;

import java.util.Arrays;

/**
 * @author bumblebee
 *
 * 70. Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {

    /*
    *  n=1, 1
    *  n=2, 2(1,1/ 2)
    *  n=3, 3(1,1,1/ 2,1/ 1,2)
    *  n=4, 5(1,1,1,1/ 2,1,1/ 1,2,1/ 1,1,2/ 2,2)
    *  n=5, 8(1,1,1,1,1/ 2,1,1,1/ 1,2,1,1/ 1,1,2,1/ 1,1,1,2/ 1,2,2/ 2,1,2/ 2,2,1)
    * */
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(6));
    }

    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(Arrays.toString(dp));
        return dp[n];
    }

}


