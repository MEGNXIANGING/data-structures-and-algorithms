package com.example.algorithm.datastructuresalgorithms.syy.arr;

public class moveZero {
    public static void moveZero(int[] nums) {
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        break;
                    }
                }
            }
        }
    }

    public void moveZero2(int[] nums) {
        int index=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        int[]  aa=new int[]{0,1,0,3,12};
        moveZero(aa);
    }

}
