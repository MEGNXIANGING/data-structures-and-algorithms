package com.example.algorithm.datastructuresalgorithms.syy.arr;

import java.util.HashMap;
import java.util.Map;

public class ArrayListCode {

    public static int maxContinuous(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int tmp = 0;
        int max=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==1){
                tmp++;
            }else {
                max=Math.max(tmp, max);
                tmp=0;
            }
        }

        return Math.max(tmp, max);
    }

    public static void main(String[] args) {
        int[]  aa=new int[]{1,1,0,1,1,1};
        maxContinuous(aa);
    }
}
