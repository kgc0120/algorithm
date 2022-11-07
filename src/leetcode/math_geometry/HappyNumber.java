package leetcode.math_geometry;

import java.util.HashSet;
import java.util.Set;

/**
 * @author bumblebee
 *
 * 202. Happy Number
 * https://leetcode.com/problems/happy-number/
 */


public class HappyNumber {

    public static void main(String[] args) {
//        int n = 19;
        int n = 2;
//        int n = 10;
//        int n = 7;
//        int n = -1;
        System.out.println(isHappy(n));

        System.out.println(143 % 10);
    }

    public static boolean isHappy(int n) {

        if(n == 1) return true;
        Set<Integer> visit = new HashSet<>();

        while (!visit.contains(n)) {
            visit.add(n);
            n = sumOfSquare(n);
            if (n == 1) return true;
        }

        return false;

    }

    private static int happyCheck(int n) {
        String s = String.valueOf(n);
        int resultNum = 0;
        for (int i = 0; i < s.length(); i++) {
             int sqrt = s.charAt(i) - '0';
             sqrt *= sqrt;
             resultNum += sqrt;
        }
        return resultNum;
    }

    private static int sumOfSquare(int n) {
        int sumSquare = 0;

        while(n != 0) {
            int digit = n % 10;
            sumSquare += digit * digit;
            n = n/10;
        }

        return sumSquare;

    }
}
