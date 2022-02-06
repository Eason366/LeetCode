package com;

import java.util.Arrays;
import java.util.HashMap;

public class leetcode287 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,3,4,2,2};
        int k = findDuplicate(nums);
        System.out.println(k);
    }

    private static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i<nums.length-1;i++){
            if (nums[i]==nums[i+1]) return nums[i];
        }
        return -1;
    }


}
