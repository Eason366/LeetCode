package com;

public class leetcode388 {
    public static void main(String[] args) {
        int n = 15;
        int[] ans = countBits(n);
        for (int num:ans) {
            System.out.println(num);
        }
    }

    private static int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i = 0; i< ans.length;i++){
            ans[i] = i%2+ans[i/2];
        }
        return ans;
    }

}
