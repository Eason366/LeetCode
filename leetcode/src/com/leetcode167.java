package com;

public class leetcode167 {

    public static void main(String[] args) {
        int[] numbers = new int[] {2,3,4};
        int target = 6;
        int[] k = twoSum(numbers,target);
        for (int i:k) {
            System.out.println(i);
        }
    }

    private static int[] twoSum(int[] numbers, int target) {
        int begin = 0;
        int end = numbers.length-1;
        int[] result = new int[] {begin+1,end+1};

        while (begin<end){
            if (numbers[begin]+numbers[end]>target) {
                end--;
                result = new int[] {begin+1,end+1};
            }
            else if (numbers[begin]+numbers[end]<target) {
                begin++;
                result = new int[] {begin+1,end+1};
            }
            else return result;
        }
        return result;
    }

}
