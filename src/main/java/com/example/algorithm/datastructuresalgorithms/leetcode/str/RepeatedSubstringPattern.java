package com.example.algorithm.datastructuresalgorithms.leetcode.str;

/**
 * @Author: apple
 * @Description: Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
 * You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
 * @Date: 2020/12/20 上午10:00
 */
public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        String temp=s+s;
        return temp.substring(0,temp.length()-1).contains(s);

    }

    public static void main(String[] args) {
        String ad = "abaababaab";
        System.out.println(repeatedSubstringPattern(ad));
    }
}
