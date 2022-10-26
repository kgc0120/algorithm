package leetcode;

import java.util.Arrays;

/**
 * @author bumblebee
 */

public class TwoSum {

    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
//        int target = 9;

        int[] nums = {3,2,4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int num1 = nums[j];
                if ((num + num1) == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

}
