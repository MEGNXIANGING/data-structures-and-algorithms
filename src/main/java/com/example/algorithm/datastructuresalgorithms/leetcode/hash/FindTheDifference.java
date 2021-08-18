package com.example.algorithm.datastructuresalgorithms.leetcode.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character item:chars){
            if (map.containsKey(item)){
                map.put(item,map.get(item)+1);
            }else {
                map.put(item,1);
            }
        }
        char[] tChars = t.toCharArray();
        for(Character item:tChars){
            if (map.containsKey(item)){
                if (map.get(item)>1){
                    map.put(item,map.get(item)-1);
                }else {
                    map.remove(item);
                }
            }else {
                return item;
            }
        }
        return '0';
    }
}
