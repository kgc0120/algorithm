package leetcode.bit_manipulation;

import java.util.Arrays;

/**
 * @author bumblebee
 * 268. Missing Number
 *
 * https://leetcode.com/problems/missing-number/
 */

public class MissingNumber {

    public static void main(String[] args) {
//        int[] nums = {3,0,1};
        int[] nums = {0,1,2,3};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber2(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num != i) return i;
        }

        return nums.length;
    }

    public static int missingNumber(int[] nums) {

        int totalSum = nums.length * (nums.length +1) /2 ;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return totalSum - sum;
    }

}
