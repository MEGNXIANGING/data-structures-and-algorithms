package com.example.algorithm.datastructuresalgorithms.leetcode.arr;

/**
 * @Author: apple
 * @Description: You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * @Date: 2020/9/27 上午8:55
 */
public class TwoNumbersAdd {
    public static void main(String[] args) {
       int t=1;
       t+=3;
        System.out.println(15%10);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dump = new ListNode(-1),curr=dump;
        int t=0;
        while (l1!=null || l2!=null || t!=0){
            if (l1!=null){
                t+=l1.val; l1=l1.next;
            }
            if (l2!=null){
                t+=l2.val;l2=l2.next;
            }
            curr= curr.next=new ListNode(t%10);
            t=t/10;
        }
        return dump.next;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
