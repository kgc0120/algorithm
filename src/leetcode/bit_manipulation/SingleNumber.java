package leetcode.bit_manipulation;

import leetcode.math_geometry.PlusOne;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bumblebee
 * 136. Single Number
 *
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumber {

    public static void main(String[] args) {

//        int[] nums = {2,2,1};

        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));

        int a = 4;
        a ^= 5;
        a ^= 11;
        System.out.println(a);

    }

    public static int singleNumber2(int[] nums) {

        Map<Integer, Integer> map = new HashMap();

        for (int num : nums) {
            if(map.containsKey(num)) {
                int cnt = map.get(num);
                map.put(num, cnt+1);
            }else {
                map.put(num, 1);
            }
        }
        for (Integer integer : map.keySet()) {
            if(map.get(integer) == 1) return integer;
        }

        return 0;
    }

    public static int singleNumber(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) ans ^= nums[i];
        return ans;
    }


}
