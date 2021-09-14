package com.example.algorithm.datastructuresalgorithms.leetcode.twoProint;

public class SavePeople {
    public static void main(String[] args) {
        int[] arr=new int[] {2,6,3,5,9};
        quickSort(arr,0,arr.length-1);
        System.out.println(arr);
    }

    public int numRescueBoats(int[] people, int limit) {
        if (people.length<1){
            return 0;
        }
        quickSort(people,0,people.length-1);
        //排序
        int l=0;
        int r=people.length-1;
        int res=0;
        while (l<=r){
            if (people[l]+people[r]<=limit){
                l++;
            }
            r--;
            res++;
        }
        return res;
    }

    public static void quickSort(int []arr,int left,int right){
        if (left<right){
            int l=left;
            int r=right;
            int temp=arr[l];
            while (l<r){
                while (l<r && arr[r]>=temp) r--;
                if (l<r) arr[l]=arr[r];
                while (l<r && arr[l]<temp) l++;
                if (l<r) arr[r]=arr[l];
            }
            arr[l]=temp;
            quickSort(arr,left,l);
            quickSort(arr,r+1,right);
        }
    }
}
