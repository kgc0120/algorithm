package leetcode;

import java.util.Arrays;

/**
 * @author bumblebee
 *
 * 242. Valid Anagram
 */
public class ValidAnagram {

    public static void main(String[] args) {
        String s = "a";
        String t = "ab";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        String[] splitS = s.split("");
        Arrays.sort(splitS);
        String[] splitT = t.split("");
        Arrays.sort(splitT);

        boolean result = true;
        for (int i = 0; i < splitS.length; i++) {
            String split = splitS[i];
            if(!split.equals(splitT[i])) return false;
        }

        return result;
    }

    public boolean isAnagramSolution(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }

}
