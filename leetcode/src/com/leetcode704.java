package com;

public class leetcode704 {

    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,3,5,9,12};
        int target = 9;
        int n = search(nums,target);
        System.out.println(n);

    }

    private static int search(int[] nums, int target) {

        int begin = 0;
        int end = nums.length;
        while (begin<end){
            int index = begin + (end - begin)/2;
            if (nums[index] == target) return index;
            else if (nums[index]<target) begin = index+1;
            else  end = index;

        }
        return -1;
    }


}
