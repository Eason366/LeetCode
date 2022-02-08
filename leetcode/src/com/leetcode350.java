package com;


import java.util.ArrayList;
import java.util.HashMap;

public class leetcode350 {

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,2,1};
        int[] nums2 = new int[] {2,2};
        int k[] = intersection(nums1,nums2);
        for (int n : k) {
            System.out.println(n);
        }
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i<nums1.length;i++){
            if (!map.keySet().contains(nums1[i])) map.put(nums1[i],1);
            else map.put(nums1[i],map.get(nums1[i])+1);
        }

        ArrayList<Integer> r = new ArrayList<Integer>();

        for (int i = 0; i<nums2.length;i++){
            if (map.keySet().contains(nums2[i])) {
                if (map.get(nums2[i])>1){
                    map.put(nums2[i],map.get(nums2[i])-1);
                    r.add(nums2[i]);
                }
                else {
                    map.remove(nums2[i]);
                    r.add(nums2[i]);
                }
            }
        }
        int [] result = new int[r.size()];
        int i = 0;
        for (int num:r) {
            result[i++] = num;
        }
        return result;
    }


}
