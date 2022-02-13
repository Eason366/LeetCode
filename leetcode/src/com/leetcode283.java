package com;

public class leetcode283 {
    private static int[] nums = new int[] {1,0};
    public static void main(String[] args) {
        moveZero(nums);
        for (int n :nums) {
            System.out.println(n);
        }
    }

    private static void moveZero(int[] nums) {
        int index = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!=0) {
                if(index!=i){
                    nums[index] = nums[i];
                    nums[i] = 0;
                }
            }
            if(nums[index]!=0) index++;
        }
    }


}
