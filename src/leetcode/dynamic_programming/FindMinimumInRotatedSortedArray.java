package leetcode.dynamic_programming;

/**
 * @author bumblebee
 *
 * 153. Find Minimum in Rotated Sorted Array
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * O(log N) 복잡도
 */
public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
//        int[] nums = {3,1,2};
        System.out.println(findMinSol(nums));
    }

    // 두 풀이 다 정답
    public static int findMin(int[] nums) {

        if (nums.length == 1) return nums[0];

        int minimum = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length -1;

        for (int i = 0; i < nums.length/2; i++) {
            minimum = Math.min(minimum, Math.min(nums[left], nums[right]));
            left += 1;
            right -= 1;

        }
        if (nums.length % 2 == 1) return Math.min(minimum, nums[nums.length/2]);

        return minimum;
    }

    public static int findMinSol(int[] nums) {

        int left = 0;
        int right = nums.length -1;

        while (left <= right) {
            if(nums[left] <= nums[right] ) {
                return nums[left];
            }

            int mid = (left + right) / 2;
            if(nums[mid] >= nums[left]) {
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return 0;
    }
}
