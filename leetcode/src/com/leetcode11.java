package com;

public class leetcode11 {

    public static void main(String[] args) {
        int[] height = new int[]{2,3,4,5,18,17,6};

        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {

        int begin =0;
        int end = height.length-1;
        int max = 0;
        while (begin<end){
            int width = end-begin;
            int length = 0;
            if (height[end]>height[begin]) length = height[begin++];
            else length = height[end--];
            int area = width*length;
            if (area>max) max=area;
        }
        return max;
    }
}
