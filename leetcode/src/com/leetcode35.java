package com;

public class leetcode35 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5,6};
        int target = 2;
        int n = searchInsert(nums,target);
        System.out.println(n);

    }

    private static int searchInsert(int[] nums, int target) {

        int begin = 0;
        int end = nums.length;
        int index = begin + (end - begin)/2;
        while (begin < end) {
            if (nums[index] == target) break;
            else if (nums[index]<target) begin = index+1;
            else  end = index;
            index = begin + (end - begin)/2;

        }
        return index;

    }
}
