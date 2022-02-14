package com;

import java.util.HashMap;

public class leetcode977 {

    public static void main(String[] args) {
        int[] nums = new int[] {-7,-3,2,3,11};
        int[] k = sortedSquares(nums);
        for (int num :k) {
            System.out.println(num);
        }
    }

    private static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int begin = 0;
        int end = nums.length-1;
        int i = nums.length-1;
        while (begin<=end){
            if (nums[end]*nums[end]<nums[begin]*nums[begin]) result[i--] = nums[begin]*nums[begin++];
            else result[i--] = nums[end]*nums[end--];
        }
        return result;
    }


}
