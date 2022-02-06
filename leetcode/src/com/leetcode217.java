package com;

import java.util.HashMap;

public class leetcode217 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4};
        boolean k = containsDuplicate(nums);
        System.out.println(k);
    }

    private static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int num :nums) {
            if (map.keySet().contains(num)){
                return true;
            }
            else map.put(num,1);
        }
        return false;
    }


}
