package com;

import java.util.HashMap;

public class leetcode349 {

    public static void main(String[] args) {
        int[] nums1 = new int[] {4,9,5};
        int[] nums2 = new int[] {9,4,9,8,4};
        int k[] = intersection(nums1,nums2);
        for (int n : k) {
            System.out.println(n);
        }
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i<nums1.length;i++){
            if (!map.keySet().contains(nums1[i])) map.put(nums1[i],1);
        }

        HashMap<Integer,Integer> r = new HashMap<Integer,Integer>();


        for (int i = 0; i<nums2.length;i++){
            if (map.keySet().contains(nums2[i])) {
                map.remove(nums2[i]);
                r.put(nums2[i],1);
            }
        }
        int [] result = new int[r.size()];
        int i = 0;
        for (int num:r.keySet()) {
            result[i++] = num;
        }
        return result;
    }


}
