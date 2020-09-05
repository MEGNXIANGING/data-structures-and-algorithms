package com.example.algorithm.datastructuresalgorithms.leetcode.offer;

import java.util.Stack;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/8/13 下午10:55
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public class PrintList {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        ListNode(int x) {
            val = x;
        }

    }
    public static int[] reversePrint(ListNode head) {
        Stack<Integer> items = new Stack<>();
        while (head!=null){
            items.push(head.val);
            head=head.next;
        }
        int[] ints =new int[items.size()];
        for (int i = 0; i <ints.length ; i++) {
            ints[i]=items.pop();
        }
        return ints;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(3,new ListNode(2,null)));
        int[] ints = reversePrint(head);
        System.out.println(ints);
    }
}
