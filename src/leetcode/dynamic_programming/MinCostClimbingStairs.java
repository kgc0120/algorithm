package leetcode.dynamic_programming;

import java.util.Arrays;

/**
 * @author bumblebee
 */
public class MinCostClimbingStairs {

    public static void main(String[] args) {

//        int[] cost = {10,15,20};
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {

        int[] res = new int[cost.length + 1];
        res[cost.length] = 0;
        res[cost.length - 1] = cost[cost.length - 1];

        for (int i = cost.length - 2; i >= 0; i--) {
            res[i] = (res[i + 1] < res[i + 2]) ? res[i + 1] + cost[i] : res[i + 2] + cost[i];
        }

        return Math.min(res[0], res[1]);
    }
}
