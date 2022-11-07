package codility;

/**
 * @author bumblebee
 */
public class test2 {

    public static void main(String[] args) {
        int N = 1990;
        System.out.println(solution(N));
    }

    public static int solution(int N) {
        // write your code in Java SE 8

        String strNum = String.valueOf(N);
        String[] split = strNum.split("");
        int targetSum = 0;
        for (int i = 0; i < split.length; i++) {
            targetSum += Integer.parseInt(split[i]);
        }
        N++;
        while (true) {
            int result = N++;
            String digit = String.valueOf(result);
            String[] digitSplit = digit.split("");

            int digitSum = 0;
            for (int i = 0; i < digitSplit.length; i++) {
                digitSum += Integer.parseInt(digitSplit[i]);
            }

            if(digitSum == targetSum) return result;
        }
    }

}
