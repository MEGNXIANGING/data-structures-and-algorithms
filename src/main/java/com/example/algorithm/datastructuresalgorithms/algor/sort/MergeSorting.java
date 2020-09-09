package com.example.algorithm.datastructuresalgorithms.algor.sort;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/9 下午11:51
 */
public class MergeSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 4, 9, 7, 3};
        int[] temp=new int[arr.length];
        mergeSort(arr,0,arr.length-1,temp);
    }


    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid, temp);
            mergeSort(arr, mid + 1, right, temp);
            merge(arr,left,mid,right,temp);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t] = arr[i];
                t += 1;
                i += 1;
            } else {
                temp[t] = arr[j];
                t += 1;
                j += 1;
            }
        }

        while (i <= mid) {
            temp[t] = arr[i];
            t += 1;
            i += 1;
        }

        while (i <= right) {
            temp[t] = arr[i];
            t += 1;
            j += 1;
        }

        t = 0;
        int tempLeft = left;
        while (tempLeft <= right) {
            arr[tempLeft] = temp[t];
            t += 1;
            tempLeft += 1;
        }

    }
}
