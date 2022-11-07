package leetcode.two_pointers;

/**
 * @author bumblebee
 *
 * 125. Valid Palindrome
 */
public class ValidPalindrome {

    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
//        String s =  "race a car";
        String s =  " 0P0 ";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String lowerStr = s.toLowerCase();
        String s1 = lowerStr.replaceAll("[^a-z0-9]", "");

        if (s1.length() == 0) {
            return true;
        }

        for (int i = 0; i < s1.length()/2; i++) {
            char front = s1.charAt(i);
            char back = s1.charAt(s1.length() -1 - i);
            if(front == back) {
                System.out.println(front +", "+ back);
            } else {
                return false;
            }
        }
        return true;
    }

}
