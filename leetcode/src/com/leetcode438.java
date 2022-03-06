package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode438 {
    public static void main(String[] args) {
        String s = "abab";
        String p = "ba";




        List<Integer> result = findAnagrams(s,p);
        System.out.println(result);

    }

    private static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] cp = new int[26];
        int[] sp = new int[26];

        int low = 0;
        int fast = 0;

        for (char c :p.toCharArray()) {
            cp[c-'a'] +=1;
        }

        for (;fast<s.length();){
            if (fast>=p.length()){
                sp[s.charAt(low)-'a']-=1;
                low++;
            }
            sp[s.charAt(fast)-'a']+=1;
            fast++;
            boolean os = Arrays.equals(cp,sp);
            if (os) result.add(low);
        }





        return result;
    }


}
