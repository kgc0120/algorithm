package leetcode.math_geometry;

import java.util.Arrays;

/**
 * @author bumblebee
 *
 * 66. Plus One
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {

    public static void main(String[] args) {
//        int[] digits = {1,2,3};
        int[] digits = {9};

//        int[] digits = {9,8,7,6,5,4,3,2,1,0};

        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {

        int len = digits.length;
        int[] newDigits = new int[len + 1];

        int carry = 1;
        int currySum = 0;

        for (int i = len-1; i >= 0; i--) {
            int digit = digits[i];
            currySum = digit + carry;

            if(currySum >= 10) {
                digits[i] = currySum % 10;
                newDigits[i+1] = digits[i];
                carry = 1;
            } else {
                digits[i] = currySum;
                newDigits[i+1] = digits[i];
                carry = 0;
                break;
            }
        }

        if(carry == 1) {
            newDigits[0] = 1;
            return newDigits;
        }

        return digits;

    }

}
