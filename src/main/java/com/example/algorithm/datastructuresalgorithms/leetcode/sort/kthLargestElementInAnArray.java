package com.example.algorithm.datastructuresalgorithms.leetcode.sort;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargestElementInAnArray {

    public static void main(String[] args) {
        int[] ints = {-1,1,-3,9,0,0};
        quickSort(ints,0,ints.length-1);
    }
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums,0,nums.length-1);
        return nums[nums.length-k];
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int l = left;
        int r = right;
        int temp = arr[l];
        while (l < r) {
            while (l < r && arr[r] >= temp) r--;
            if (l < r) arr[l] = arr[r];
            while (l < r && arr[l] < temp) l++;
            if (l < r) arr[r] = arr[l];
        }
        arr[l] = temp;
        quickSort(arr, left, l);
        quickSort(arr, r + 1, right);
    }

    /**
     *  max heap
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest1(int[] nums, int k) {
        //create a max heap
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer item:nums){
            heap.add(item);
        }
        for (int i = 0; i < k-1; i++) {
            heap.poll();
        }
        return heap.poll();
    }
}
