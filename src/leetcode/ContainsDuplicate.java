package leetcode;

import java.util.HashSet;

/**
 * @author bumblebee
 *
 * 217. Contains Duplicate
 */
public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] param = {1,2,3,1};
        int[] param2 = {1,2,3,4};
        int[] param3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(param3));
    }

    public static boolean containsDuplicate(int[] nums) {

        HashSet hashSet = new HashSet();
        for (int num : nums) {
            hashSet.add(num);
        }

        return nums.length != hashSet.size() ? true : false;
    }


}
