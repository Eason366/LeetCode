package com;

public class leetcode88 {

    public static void main(String[] args) {
        int[] nums1 =new int[] {10,11,12,0,0,0};
        int[] nums2 =new int[] {1,5,15};
        int m=3;
        int n=3;




        for (int i = nums1.length-1; m>0&&n>0;i--){
            if(nums1[m-1]<nums2[n-1]){
                nums1[i]=nums2[--n];
            }
            else nums1[i]=nums1[--m];
        }

        for (;n>0;n--){
            nums1[n-1] = nums2[n-1];
        }


        System.out.println(m);
        System.out.println(n);
        System.out.println();
        for (int num :nums1) {
            System.out.println(num);
        }
    }

}
