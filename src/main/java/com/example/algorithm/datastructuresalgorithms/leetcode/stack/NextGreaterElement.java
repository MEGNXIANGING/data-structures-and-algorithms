package com.example.algorithm.datastructuresalgorithms.leetcode.stack;

import com.example.algorithm.datastructuresalgorithms.algor.stack.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 1, 2};
        int[] nums2 = new int[]{1, 3, 4, 2};
        int[] ints = nextGreaterElement(nums1, nums2);
        System.out.println();
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ints = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        //stack insert nums2 all element
        for (int i = 0; i < nums2.length; i++) {
            stack.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            Stack<Integer> temp = new Stack<>();
            int cur = nums1[i];
            int max = -1;
            boolean flag = false;
            while (!stack.isEmpty() && !flag) {
                Integer top = stack.pop();
                if (top > cur) {
                    max = top;
                } else if (top == cur) {
                    flag = true;
                }
                temp.push(top);
            }
            ints[i] = max;
            while (!temp.isEmpty()) {
                stack.push(temp.pop());
            }
        }
        return ints;
    }

}
