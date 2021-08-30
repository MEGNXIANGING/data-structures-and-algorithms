package com.example.algorithm.datastructuresalgorithms.leetcode.sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] ints = {5,1,1,2,0,0};
        sortArray(ints);
    }
    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void quickSort(int[] arr, int left, int right) {
        int l = left, r = right;
        if (l < r) {
            int temp = arr[l];
            while (l < r) {
                while (l < r && arr[r] >= temp) r--;
                if (l < r) arr[l] = arr[r];
                while (l < r && arr[l] < temp) l++;
                if (l < r) arr[r] = arr[l];
            }
            arr[l] = temp;
            quickSort(arr, left, l);
            quickSort(arr, l + 1, right);
        }

    }
}
