package com;

public class leetcode34 {

    public static void main(String[] args) {
        int[] nums = new int[] {1};
        int target = 1;
        int[] n = searchRange(nums,target);
        for (int num : n) {
            System.out.println(num);
        }
    }

    private static int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) return new int[] {-1,-1};
        int[] result = new int[2];
        result[0] = search1(nums,target);
        result[1] = search2(nums,target);
        return  result;
    }

    private static int search2(int[] nums, int target) {

        int begin = 0;
        int end = nums.length;

        while (begin+1<end){
            int index = (end+begin)/2;
            if (nums[index]<=target) begin = index;
            else end = index;
        }
        if (nums[begin]==target)return begin;
        return -1;
    }

    private static int search1(int[] nums, int target) {

        int begin = -1;
        int end = nums.length-1;

        while (begin+1<end){
            int index = (end+begin)/2;
            if (nums[index]<target) begin = index;
            else end = index;
        }
        if (nums[end]==target)return end;
        return -1;
    }


}
