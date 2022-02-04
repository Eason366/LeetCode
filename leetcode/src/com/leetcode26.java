package com;

import java.util.List;

public class leetcode26 {

    public static void main(String[] args) {
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4}; // Input array
        int[] expectedNums = new int[] {1,2,}; // The expected answer with correct length

        int k = removeDuplicates1(nums); // Calls your implementation

        System.out.println(k);
    }

    private static int removeDuplicates(int[] nums) {
        int n = nums[0];
        int index = 0;
        for (int i =1; i<nums.length;i++){
            if (nums[i]!=n){
                n = nums[i];
                nums[++index] = n;
            }
        }
        index++;
        for (int i=0; i<index;i++){
            System.out.println(nums[i]);
        }
        System.out.println();
        return index;
    }

    public static int removeDuplicates1(int[] nums) {
        int n = Integer.MIN_VALUE;
        int index = 0;
        for (int i:nums) {
            if (i != n) {
                nums[index++] = i;
                n = i;
            }
        }
        for (int i=0; i<index;i++){
            System.out.println(nums[i]);
        }
        System.out.println();
        return index;
    }
}
