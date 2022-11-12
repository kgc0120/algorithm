package codility;

/**
 * @author bumblebee
 *
 * https://app.codility.com/demo/results/trainingMQZ7ZV-G3D/
 */
public class MaxProfit {

    public static void main(String[] args) {
        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int left = 0;
        int right = 1;
        int maxProfic = 0;
        while (right < A.length) {
            if(A[left] < A[right]) {
                maxProfic = Math.max(maxProfic, A[right] - A[left]);
                right++;
            }else{
                left = right;
                right++;
            }
        }
        return maxProfic;


    }



}


