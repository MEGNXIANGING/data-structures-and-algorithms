package com.example.algorithm.datastructuresalgorithms.leetcode.list;

import java.util.HashMap;

public class colorSort {
    public static void sortColors(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int temp=nums[l];
        while (l<r){
            while (l<r && nums[r]>=temp){
                r--;
            }
            if (l<r){
                nums[l]=nums[r];
            }
            while (l<r&& nums[l]<temp){
                l++;
            }
            if (l<r){
                nums[r]=nums[l];
            }
        }
        nums[l]=temp;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{2,0,1};
        quickSort(arr,0,2);
        System.out.println(arr);
    }

    public static void quickSort3 (int []arr,int left,int right){
        if(left<right){
            int l=left;
            int r=right;
            int temp=arr[l];

            while(l<r){
                while(l<r && arr[r]>=temp){
                    r--;
                }
                if(l<r) arr[l]=arr[r];
                while(l<r && arr[l]<temp){
                    l++;
                }
                if(l<r) arr[r]=arr[l];
            }
            arr[l]=temp;
            quickSort(arr,left,l);
            quickSort(arr,r+1,right);
        }

    }
    public  static void  quickSort(int[] arr, int left, int right){
        //判断是否需要进行下去，当left=right 说明只有一个数
        if (left<right){
            //声明  左右边界、右左边界
            int l=left;
            int r=right;
            //声明随机数
            int temp=arr[l];
            while (l<r){
                //交换数据、右边
                while (l<r && arr[r]>=temp) r--;
                if (l<r) arr[l]=arr[r];
                //交换数据、左边
                while (l<r && arr[l]<temp) l++;
                if (l<r) arr[r]=arr[l];
            }
            arr[l]=temp;
            quickSort(arr,left,l);
            quickSort(arr,r+1,right);
        }

    }


    private void  quickSort2(int []arr,int left,int right){
        int l=left;
        int r=right;
        int temp=arr[l];
        while (l<r){
            while (l<r && arr[r]>temp){
                r--;
            }
            if (l<r){
                arr[l]=arr[r];
            }
            while (l<r&& arr[l]<temp){
                l++;
            }
            if (l<r){
                arr[r]=arr[l];
            }
        }
        arr[l]=temp;
        quickSort2(arr,left,l);
        quickSort2(arr,r+1,right);
    }
    public static void sortColors2(int[] nums) {
        int len=nums.length;
        if (len<2){
            return;
        }
        int p0=0;
        int i=0;
        int p2=len-1;
        while (i<=p2){
            if (nums[i]==0){
                swap(nums,p0,i);
                p0++;
                i++;
            }else if (nums[i]==1){
                i++;
            }else {
                swap(nums,p2,i);
                p2--;
            }
        }

    }

    private static void swap(int[]nums,int index1,int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}
