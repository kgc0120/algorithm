package leetcode.two_pointers;

import java.util.*;

/**
 * @author bumblebee
 * 15. 3Sum
 *
 * https://leetcode.com/problems/3sum/
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(nums);

        System.out.println(lists.toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        Set set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int num = nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    int num1 = nums[j];
                    for (int k = j + 1; k < nums.length; k++) {
                        int num2 = nums[k];
                        if ((num + num1 + num2) == 0) {
                            List<Integer> list = new ArrayList<>();
                            list.add(num);
                            list.add(num1);
                            list.add(num2);
                            set.add(list);
                        }
                    }
                }
            }
        }
        List list = set.stream().toList();
        res.addAll(list);
        return res;
    }
}
