package com.example.algorithm.datastructuresalgorithms.leetcode.recursive;

public class ReverseString {
    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        while (l<r){
            char a='a';
            a=s[l];
            s[l]=s[r];
            s[r]=a;
            l++;
            r--;
        }
    }
}
