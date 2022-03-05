package com;

public class leetcode242 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        boolean is = isAnagram(s,t);
        System.out.println(is);
    }

    private static boolean isAnagram(String s, String t) {

        int[] anagram = new int[26];

        for (char c : s.toCharArray()){
            anagram[c-'a'] += 1;
        }

        for (char c : t.toCharArray()){
            anagram[c-'a'] -= 1;
        }

        for (int i : anagram){
            if (i != 0) return false;
        }
        return true;
    }


}
