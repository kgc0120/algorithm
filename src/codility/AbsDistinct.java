package codility;

import java.util.HashSet;
import java.util.Set;

/**
 * @author bumblebee
 *
 * https://app.codility.com/demo/results/trainingG3F4PK-V6A/
 */
public class AbsDistinct {

    public static void main(String[] args) {
        int[] A = {-5,-3,-1,0,3,6};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Set set = new HashSet();
        for (int i = 0; i < A.length; i++) {
            set.add(Math.abs(A[i]));
        }
        return set.size();
    }
}
