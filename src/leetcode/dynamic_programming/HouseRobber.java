package leetcode.dynamic_programming;

/**
 * @author bumblebee
 *
 * 198. House Robber
 * https://leetcode.com/problems/house-robber/
 */
public class HouseRobber {

    public static void main(String[] args) {
//        int[] nums = {1,2,3,1};
//        int[] nums = {2,7,9,3,1};
        int[] nums = {2,1,1,2};
        System.out.println(robDp(nums));
    }

    public static int robDp(int[] nums) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
         }
        return dp[nums.length-1];
    }

}
