package com;

public class leetcode122 {

    public static void main(String[] args) {
        int[] prices = new int[] {7,1,5,3,6,4};
        int k = maxProfit(prices);
        System.out.println(k);
    }

    private static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i<prices.length-1;i++){
            if (prices[i+1]>prices[i]){
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }

}
