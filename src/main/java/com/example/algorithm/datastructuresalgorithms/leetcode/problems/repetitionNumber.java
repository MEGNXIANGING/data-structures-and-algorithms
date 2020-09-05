package com.example.algorithm.datastructuresalgorithms.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/8/9 下午6:29
 * 找出数组中重复的数字。
 * <p>
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class repetitionNumber {
    public static int findRepeatNumber(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
            if (arr[nums[i]]>1){
                return nums[i];
            }
        }
        return -1;

    }

    public static int findRepeatNumber1(int[] nums) {
        int temp;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=i){
                if(nums[i]==nums[nums[i]])
                    return nums[i];
                temp=nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
        }
        return -1;
    }

    public static int findRepeatNumber2(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }

    public static void main(String[] args) {
        int[] nums={2, 3, 1, 0, 2, 5, 3};
        int repeatNumber = findRepeatNumber2(nums);
        System.out.println(repeatNumber);
    }
}
