package com.example.algorithm.datastructuresalgorithms.leetcode.offer;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/8/14 上午10:21
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinArray {
    public static int minArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return numbers[i + 1];
            }
        }
        return numbers[0];
    }

    public static int minArray2(int[] numbers) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else if (numbers[mid] < numbers[right]) {
                right = mid;
            } else if (numbers[mid] == numbers[right]) {
                right--;
            }
        }
        return numbers[left];
    }

    public static int binaryFind(int[] numbers, int n) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] < n) {
                left = mid + 1;
            } else if (numbers[mid] > n) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {1, 3, 5, 6, 8, 12};
        System.out.println(binaryFind(ints,8));
    }
}
