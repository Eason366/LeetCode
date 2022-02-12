package com;

public class leetcode367 {

    public static void main(String[] args) {
        int num =0;
        boolean n = isPerfectSquare(num);
        System.out.println(n);

    }

    private static boolean isPerfectSquare(int num) {

        if (num == 1) return true;
        int begin = 1;
        int end = num;
        int index = (end+begin)/2;
        while (begin+1<end){
            long times = (long) index*index;
            if (times == num) return true;
            else if (times>num) end = index;
            else begin=index;
            index = (end+begin)/2;
        }
        return false;

    }


}
