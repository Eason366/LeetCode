package com;


public class leetcode303 {

    public static void main(String[] args) {
        int[] nums = new int[] {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        int param_1 = obj.sumRange(2,5);
        System.out.println(param_1);
    }



}
class NumArray {

    private int[] preSum;
    public NumArray(int[] nums) {
        if (nums.length != 0){
            preSum = new int[nums.length];
            preSum[0] = nums[0];
            for (int i = 1; i<nums.length;i++){
                preSum[i] = preSum[i-1]+nums[i];
            }
        }

    }

    public int sumRange(int left, int right) {
        return left == 0 ? preSum[right] : preSum[right]-preSum[left-1];
    }
}
