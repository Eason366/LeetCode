package com;

public class leetcode283 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,0};




        int zero = 0;
        for (int i=0; i<nums.length;i++){
            if(nums[zero]!=0) zero++;
            if(nums[i]!=0 && i>zero) {
                int temp = nums[zero];
                nums[zero]=nums[i];
                nums[i]=temp;
            }
        }



        for (int n :nums) {
            System.out.println(n);
        }
    }




}
