package codility;

/**
 * @author bumblebee
 */
public class CountDiv {

    public static void main(String[] args) {
        System.out.println(solution(6,11,2));
        System.out.println(solution(3,20,3));
    }

    public static int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int result = B/K - A/K;
        return A%K==0? result+1 : result;
    }

    public static int solution3(int A, int B, int K) {
        // write your code in Java SE 8
        int cnt =0;
        while (A <= B) {
            A += K;
            cnt++;
        }
        return cnt;
    }

    public static int solution2(int A, int B, int K) {
        // write your code in Java SE 8
        int cnt =0;
        for(int i=A; i<=B; i++) {
            if(i % K == 0) cnt++;
        }
        return cnt;
    }
}
