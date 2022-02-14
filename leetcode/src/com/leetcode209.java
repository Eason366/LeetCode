package com;

public class leetcode209 {

    public static void main(String[] args) {
        int target = 11;
        int[] nums = new int[] {1,2,3,4,5};
        int k = minSubArrayLen(target,nums);
        System.out.println(k);

    }

    private static int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }


}
