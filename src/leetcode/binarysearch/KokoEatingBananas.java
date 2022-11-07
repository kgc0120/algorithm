package leetcode.binarysearch;

/**
 * @author bumblebee
 * 875. Koko Eating Bananas
 *
 * https://leetcode.com/problems/koko-eating-bananas/
 */
public class KokoEatingBananas {

    public static void main(String[] args) {
//        int[] piles = {3,6,7,11};
//        int[] piles = {30,11,23,4,20};
        int[] piles = {312884470};
        System.out.println(minEatingSpeed(piles, 312884469));
    }

    public static int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 1;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int middle = (left + right) /2;
            int hourSpent = 0;

            for (int pile : piles) {
                hourSpent +=  Math.ceil((double)pile/ middle);
            }

            if(hourSpent <= h) {
                right = middle;
            }else {
                left = middle +1;
            }
        }
        return right;

    }
}
