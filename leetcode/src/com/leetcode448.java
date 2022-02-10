package com;

import java.util.ArrayList;
import java.util.List;

public class leetcode448 {

    public static void main(String[] args) {
        int[] nums = new int[] {4,3,2,7,8,2,3,1};
        List<Integer> k = findDisappearedNumbers(nums);

        for (int i :k) {
            System.out.println(i);
        }
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<Integer>();
        int index = 0;
        for (int i=0;i<nums.length;i++){
            index = Math.abs(nums[i])-1;
            if (nums[index]>0) nums[index]=nums[index]*-1;
        }
        for (int i=0;i<nums.length;i++){
            if (nums[i]>0) result.add(i+1);
        }
        return result;
    }


}
