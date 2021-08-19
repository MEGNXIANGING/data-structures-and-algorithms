package com.example.algorithm.datastructuresalgorithms.leetcode.hash;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    /**
     * T:O(NM)
     * S:O(N)
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (Integer item : nums2) {
            while (!stack.isEmpty() && stack.peek() < item) {
                Integer pop = stack.pop();
                map.put(pop, item);
            }
            stack.push(item);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        int index = 0;
        for (Integer item : nums1) {
            res[index] = map.get(item);
            index++;
        }
        return res;
    }
}
