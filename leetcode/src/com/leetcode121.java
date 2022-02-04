package com;

public class leetcode121 {

    public static void main(String[] args) {
        int[] prices = new int[] {2,4,1};
        int k = maxProfit(prices);
        System.out.println(k);
    }

    private static int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = prices[0];
        int profit = 0;
        for (int i = 1; i<prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];
                sell = prices[i];
            }
            else if(sell<prices[i]) {
                sell = prices[i];
            }
            profit = Math.max(profit,sell-buy);
        }
        return profit;
    }

}
