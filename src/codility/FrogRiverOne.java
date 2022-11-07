package codility;

import java.util.HashSet;
import java.util.Set;

/**
 * @author bumblebee
 */
public class FrogRiverOne {

    public static void main(String[] args) {
//        int[] A = {1,3,1,4,2,3,5,4};
        int[] A = {1,2,3};
        System.out.println(solution(3, A));
    }

    public static int solution(int X, int[] A) {
        // write your code in Java SE 8

        Set set = new HashSet();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            if(set.size() == X) return i;
        }
        return -1;
    }
}
