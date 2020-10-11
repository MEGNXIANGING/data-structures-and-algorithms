package com.example.algorithm.datastructuresalgorithms.leetcode.offer;

import com.example.algorithm.datastructuresalgorithms.algor.List;
import com.example.algorithm.datastructuresalgorithms.algor.array.ArrayList;

/**
 * @Author: apple
 * @Description: 0, 1, , n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
 * <p>
 * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字
 * ，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date: 2020/10/11 下午11:04
 */
public class LastRemain {
    public static int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int idx = 0;
        while (list.size() > 1) {
            idx = (idx + m - 1) % n;
            list.remove(idx);
            n--;
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        lastRemaining(5,3);
    }
}
