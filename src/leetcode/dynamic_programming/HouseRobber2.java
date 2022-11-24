package leetcode.dynamic_programming;

/**
 * @author bumblebee
 *
 * 213. House Robber II
 * https://leetcode.com/problems/house-robber-ii/description/
 */
public class HouseRobber2 {

    public static void main(String[] args) {

//        int[] nums = {2,3,2};
        int[] nums = {1,2,1,1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {

        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        return Math.max(robbinHelper(nums, 0, nums.length-2),
                robbinHelper(nums, 1, nums.length-1));

    }

    private static int robbinHelper(int[] nums, int start, int end) {
        int rob1= 0;
        int rob2 = 0;
        for (int i = start; i <= end; i++) {
            int temp = Math.max(rob1 + nums[i], rob2 );
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }


}
