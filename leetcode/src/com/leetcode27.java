package com;

public class leetcode27 {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2}; // Input array
        int val = 2; // Value to remove


        int k = removeElement2(nums, val); // Calls your implementation
        System.out.println(k);
    }

    private static int removeElement2(int[] nums, int val) {
        int begin = 0;
        int end = nums.length-1;

        while (begin-1<end){
            if(nums[begin] == val && nums[end] != val) {
                nums[begin++] = nums[end];
                nums[end--] = val;
            }
            if(nums[begin] != val) begin++;
            if(nums[end] == val) end--;
        }
        return begin;
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
