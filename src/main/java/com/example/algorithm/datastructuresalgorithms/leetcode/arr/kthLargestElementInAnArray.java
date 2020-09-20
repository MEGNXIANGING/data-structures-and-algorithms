package com.example.algorithm.datastructuresalgorithms.leetcode.arr;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Author: apple
 * @Description:
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * @Date: 2020/9/20 下午10:36
 */
public class kthLargestElementInAnArray {

    public static void main(String[] args) {
      int[] arr=  new int[]{3,2,1,5,6,4};
        System.out.println(findKthLargest2(arr,2));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    /**
     *
     * @param nums
     * @param k
     * @return
     */
    public static int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int n:nums){
            heap.add(n);
            if (heap.size()>k){
                heap.poll();
            }
        }
        return heap.peek();
    }
}
