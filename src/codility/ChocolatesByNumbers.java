package codility;

/**
 * @author bumblebee
 *
 * 유클리드 호제법(최대 공약수)
 *
 * https://app.codility.com/demo/results/trainingNTGU32-573/
 *
 */
public class ChocolatesByNumbers {

    public static void main(String[] args) {
        int N = 10;
        int M = 4;
        System.out.println(solution(N, M));
    }

    public static int solution(int N, int M) {
        // write your code in Java SE 8
        if(N == 1) return 1;
        int num;
        num = findUclidean(N, M);

        return N / num;


    }

    private static int findUclidean(int N, int M) {
        if(M == 0) return N;

        return findUclidean(M, N % M);
    }
}
