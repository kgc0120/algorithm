package codility;

/**
 * @author bumblebee
 *
 * 약수 알고리즘 최적화화
 * https://app.codility.com/demo/results/trainingN48RVB-PH4/
 */
public class CountFactors {

    public static void main(String[] args) {
        int N = 24;
        System.out.println(solution(N));

//        System.out.println(Math.sqrt(100));
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        double sqrt = Math.sqrt(N);
        int res = 0;

        for (int i = 1; i <= sqrt;   i++) {
            if(N % i == 0) {
                res++;
                if(N / i != i) {
                    System.out.println(N/i);
                    res++;
                }
            }

        }
        return res;

    }
// TIME OUT
    public static int solution2(int N) {
        // write your code in Java SE 8
        int res = 0;
        for (int i = 1; i < N; i++) {
            if(N % i == 0) res++;
        }
        return res + 1;

    }
}
