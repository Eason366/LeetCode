package com;

public class leetcode392 {

    public static void main(String[] args) {
        String s = "aaaaaa";
        String t = "bbaaaa";

        boolean isSub = isSubsequence(s,t);
        System.out.println(isSub);
    }

    private static boolean isSubsequence(String s, String t) {
        int indexS = 0;
        int indexT = 0;

        while (indexS<s.length() && indexT<t.length()){
            if (s.substring(indexS,indexS+1).equals(t.substring(indexT,indexT+1))){
                indexS++;
                indexT++;
            }else {
                indexT++;
            }
        }
        if (indexS>=s.length()) return true;
        return false;
    }
}
