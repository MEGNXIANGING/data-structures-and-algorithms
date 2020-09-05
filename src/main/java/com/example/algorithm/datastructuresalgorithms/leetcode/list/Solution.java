package com.example.algorithm.datastructuresalgorithms.leetcode.list;

/**
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
 * <p>
 * Return the decimal value of the number in the linked list.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer
 *
 * @Author: apple
 * @Description:
 * @Date: 2020/3/8 下午10:23
 */
public class Solution {
    //1,0,1，1
    public static int getDecimalValue(ListNode head) {

        int sum = 0;
        while (head != null) {
            sum <<= 1;
            sum += head.val;
            head = head.next;
        }
        return sum;
    }

    public int kthToLast(ListNode head, int k) {
        ListNode slow = head, fast = head;
        while (k >= 0) {
            fast=fast.next;
        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.val;
    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
