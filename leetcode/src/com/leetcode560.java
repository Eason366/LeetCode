package com;
import java.util.HashMap;

public class leetcode560 {

    public static void main(String[] args) {
        int[] nums = new int[] {-1,-1,1};
        int k = 0;
        int n = subarraySum(nums,k);
        System.out.println(n);

    }

    private static int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int result = 0;
        map.put(0,1);
        for (int num :nums) {
            sum += num;
            if (map.containsKey(sum-k)) result += map.get(sum-k);
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return result;

    }




}
