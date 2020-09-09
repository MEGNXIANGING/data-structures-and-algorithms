package com.example.algorithm.datastructuresalgorithms.algor.sort;

import java.util.Arrays;

/**
 * @Author: apple
 * @Description:
 * 快排  递归
 * @Date: 2020/9/9 下午11:31
 */
public class QuickSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 4, 9, 7, 3};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr,int left,int right){
        int l=left;
        int r=right;
        int pivot=arr[(l+r)/2];
        int temp;
        while (l<r){
            while (arr[l]<pivot){
                l+=1;
            }
            while (arr[r]>pivot){
                r-=1;
            }
            if (l>=r){
                break;
            }
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            if (arr[l]==pivot){
                r-=1;
            }
            if (arr[r]==pivot){
                l+=1;
            }
        }
        if (l==r){
            l+=1;
            r-=1;
        }
        if (left<r){
            sort(arr,left,r);
        }
        if (right>l){
            sort(arr,l,right);
        }

    }
}
