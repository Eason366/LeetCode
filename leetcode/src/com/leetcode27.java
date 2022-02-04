package com;

public class leetcode27 {

    public static void main(String[] args) {
        int[] nums = new int[]{1}; // Input array
        int val = 1; // Value to remove
        int[] expectedNums = {2,2}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = removeElement1(nums, val); // Calls your implementation
        System.out.println(k);
    }

    private static int removeElement1(int[] nums, int val) {
        if (nums.length==0)return 0;
        int j = 0;
        for (int i = 0; i<nums.length; i++){
            if (nums[i]!=val){
                if (i!=j){
                    nums[j]=nums[i];
                    nums[i]=val;
                }
                j++;
            }

        }
        return j;
    }

    private static int removeElement(int[] nums, int val) {
        int index = 0;
        int begin = 0;
        int end = nums.length-1;
        while (begin<=end){
            if(nums[begin]==val && nums[end]!=val){
                nums[begin] = nums[end];
                nums[end] = val;
                end--;
                index++;
            }
            else if (nums[begin]==val && nums[end]==val){
                end--;
                index++;
            }
            else begin++;
        }

        for (int i :nums) {
            System.out.println(i);
        }
        System.out.println();
        return nums.length-index;
    }




}
