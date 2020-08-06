package com.example.algorithm.datastructuresalgorithms.algor.leetcode.stack;

import java.util.Stack;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/4/1 下午11:23
 */
public class parentheses {
    public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i <s.length() ; i++) {
                char c=s.charAt(i);
                if (c =='(' || c=='{' || c=='['){
                    stack.push(c);
                }else {
                    if (stack.isEmpty()) return false;
                    char left = stack.pop();
                    if (left=='(' && c!=')') return false;
                    if (left=='[' && c!=']') return false;
                    if (left=='{' && c!='}') return false;
                }
            }
            return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));

    }
}
