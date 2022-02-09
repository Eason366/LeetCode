package com;

public class leetcode414 {

    public static void main(String[] args) {
        int[] nums = new int[] {2,2,3,1};
        int k = thirdMax(nums);
        System.out.println(k);
        }

    private static int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer num :nums) {
            if (num.equals(max1)||num.equals(max2)||num.equals(max3)) continue;
            if (max1 == null || num>max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2==null||num>max2){
                max3 = max2;
                max2 = num;
            } else if (max3==null||num>max3){
                max3 = num;
            }
        }

        if (max3 == null)return max1;
        return max3;

    }



}
