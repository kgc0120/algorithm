package leetcode.dynamic_programming;

import java.util.HashSet;
import java.util.Set;

/**
 * @author bumblebee
 *
 * 5. Longest Palindromic Substring
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
//        String s = "babad";
//        String s = "cbbd";
//        String s = "c";
        String s = "aacabdkacaa";
//        System.out.println(longestPalindrome(s));
        System.out.println(longestPalindromeSol(s));
//        System.out.println(s.substring(0, 1));
    }

    public static String longestPalindrome(String s) {

//        if (s.length() == 1) return s;

        Set set = new HashSet();
        String res = "";
        String resultStr = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res +=  c;
            if(set.contains(c)) {
                String substring = res.substring(res.indexOf(c));
                if(resultStr.length() < substring.length()) {
                    resultStr = substring;
                }
            }else {
                set.add(c);
            }
        }
        return resultStr.length() >= 2 ? resultStr : String.valueOf(s.charAt(0)) ;
    }

    public static String longestPalindromeSol(String s) {

        if (s.length() < 2) return s;

        int resultLength = 0;
        String result = "";
        for (int i = 0; i < s.length(); i++) {

            // odd length
            int left = i, right = i;
            while(left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)) {
                if((right - left) + 1 >= resultLength) {
                    result = s.substring(left, right + 1);
                    resultLength = right - left + 1;
                }
                left -= 1;
                right += 1;
            }

            // even length
            left = i;
            right = i+1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if((right - left) + 1 >= resultLength) {
                    result = s.substring(left, right + 1);
                    resultLength =  right - left  + 1;
                }
                left -= 1;
                right += 1;
            }

        }

        return result;
    }

}
