package leetcode;

/**
 * @author bumblebee
 * 121. Best Time to Buy and Sell Stock
 *
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

//        int[] prices = {7,1,5,3,6,4};
//        int[] prices = {7,6,4,3,1};
//        int[] prices = {7,6,4,3,1, 100, 92, 999};

        int[] prices = {2,1,2,0,1};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfic = 0;
        while (right < prices.length) {
            if(prices[left] < prices[right]) {
                maxProfic = Math.max(maxProfic, prices[right] - prices[left]);
                right++;
            }else{
                left = right;
                right++;
            }
        }
        return maxProfic;
    }

    public static int maxProfit2(int[] prices) {
        int maxNum =0;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];

            for (int j = i+1; j < prices.length; j++) {
                int price1 = prices[j];
                maxNum = Math.max(maxNum, price1 - price);
            }

        }
        return maxNum;
    }




}
