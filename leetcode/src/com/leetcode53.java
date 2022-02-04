package com;

public class leetcode53 {

    public static void main(String[] args) {
        int[] nums =new int[] {-2,1,-3,4,-1,2,1,-5,4};
        int k = maxSubArray(nums);
        System.out.println(k);
    }

    private static int maxSubArray(int[] nums) {
        int tempMax = nums[0];
        int fianlMax = nums[0];
        for (int i = 1; i<nums.length;i++){
            tempMax = Math.max(tempMax+nums[i],nums[i]);
            fianlMax = Math.max(tempMax,fianlMax);
        }
        return fianlMax;
    }
}
