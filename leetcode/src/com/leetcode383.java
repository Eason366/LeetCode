package com;

public class leetcode383 {
    public static void main(String[] args) {
        String ransomNote = "aaa", magazine = "aab";

        boolean is = isAnagram(ransomNote,magazine);
        System.out.println(is);
    }

    private static boolean isAnagram(String ransomNote, String magazine) {

        int[] anagram = new int[26];

        for (char c : magazine.toCharArray()){
            anagram[c-'a'] += 1;
        }

        for (char c : ransomNote.toCharArray()){
            anagram[c-'a'] -= 1;
        }

        for (int i : anagram){
            if (i < 0) return false;
        }
        return true;
    }


}
