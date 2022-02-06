package com;

import java.util.HashMap;

public class leetcode219 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,1,2,3};
        int k = 2;
        boolean b = containsNearbyDuplicate(nums,k);
        System.out.println(b);
    }

    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i<nums.length;i++) {
            if (map.keySet().contains(nums[i])){
                if (Math.abs(map.get(nums[i])-i)<=k) return true;
                else map.put(nums[i],i);
            }
            else map.put(nums[i],i);
        }
        return false;
    }


}
