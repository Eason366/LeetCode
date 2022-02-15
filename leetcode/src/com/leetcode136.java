package com;

public class leetcode136 {

    public static void main(String[] args) {
        int[] nums = new int[] {4,1,2,1,2};
        int n = singleNumber(nums);
        System.out.println(n);

    }

    private static int singleNumber(int[] nums) {
        int ans = 0;
        for (int num: nums) {
            ans = ans^num;
        }
        return ans;
    }


}
