package codility;

/**
 * @author bumblebee
 *
 * https://app.codility.com/demo/results/trainingUE2ASY-DQB/
 */
public class MinPerimeterRectangle {

    public static void main(String[] args) {
        int N = 36;
        System.out.println(solution(N));
    }


    public static int solution(int N) {
        // write your code in Java SE 8

        if(N==1) return 4;

        double sqrt = Math.sqrt(N);
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= sqrt;   i++) {
            if(N % i == 0) {
                if(N / i != 1) {
                    min = Math.min(min, (i + N/i) * 2 );
                }
            }
        }
        return min;

    }
}
