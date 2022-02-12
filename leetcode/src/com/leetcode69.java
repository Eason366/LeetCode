package com;

public class leetcode69 {
    private static int a;
    public static void main(String[] args) {
        int x = 10;
        int root = mySqrt1(x);
        System.out.println(root);
    }

    private static int mySqrt(int x) {

            if (x == 0) return 0;
            int begin = 1;
            int end = x;
            int index = begin+(end-begin)/2;
            while (begin+1<end){
                long times = (long) index*index;
                if (times == x) return index;
                else if (times>x) end = index;
                else begin=index;
                index = (end+begin)/2;
            }
            return index;
    }
    public static int mySqrt1(int x) {

        a = x;
        double result = Newton(x);
        return (int) result;
    }

    private static double Newton(double x) {
        double root = (x+a/x)/2;
        if((int)root == (int)x) return root;
        return (Newton(root));

    }

}
