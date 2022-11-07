package codility;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bumblebee
 *
 * https://app.codility.com/demo/results/trainingBZYYGM-N5E/
 */
public class Dominator {

    public static void main(String[] args) {
        int[] A = {3,4,3,2,3,-1,3,3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> map = new HashMap<>();
        int mid = A.length /2;
        for (int i = 0; i < A.length; i++) {
            map.putIfAbsent(A[i], 0);
            map.put(A[i], map.get(A[i]) +1);
        }
        int findDominator = 0;

        for(Map.Entry<Integer, Integer> elem : map.entrySet()){
            if(elem.getValue() > mid) {
                findDominator = elem.getKey();
                break;
            }
        }

        if(findDominator != 0) {
            for (int i = 0; i < A.length; i++) {
                if(A[i] == findDominator) return i;
            }
        }

        return -1;

    }
}
