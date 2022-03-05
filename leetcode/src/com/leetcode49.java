package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetcode49 {
    public static void main(String[] args) {
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};

        ArrayList<String> result = groupAnagrams(strs);
        System.out.println(result);

    }

    private static ArrayList<String> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = String.copyValueOf(c);

            if (!map.containsKey(key)) map.put(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }


}
