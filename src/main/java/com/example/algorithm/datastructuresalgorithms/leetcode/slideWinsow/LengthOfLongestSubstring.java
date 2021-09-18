package com.example.algorithm.datastructuresalgorithms.leetcode.slideWinsow;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s==null || s.length()==0){
            return 0;
        }
        char[] chars = s.toCharArray();
        int j=0;
        int res=0;
        Set<Character> sets = new HashSet<>();
        while (j<chars.length){
            char aChar = chars[j];
            if (!sets.contains(aChar)){
                sets.add(aChar);
            }else {
                res=Math.max(res,sets.size());
                sets=new HashSet<>();
                sets.add(aChar);
            }
            j++;
        }
        return Math.max(res,sets.size());
    }

    public static void main(String[] args) {
        String s="abcabcbb";
        lengthOfLongestSubstring(s);
    }
}
