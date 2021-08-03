package com.example.algorithm.datastructuresalgorithms.leetcode.list;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/2/29 下午4:44
 * 206. 反转链表
 */
public class reverseLinkedList206 {


    static class Solution {
        public static ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode newHead = null;
            while (head != null) {
                ListNode temp = head.next;
                head.next = newHead;
                newHead = head;
                head = temp;
            }
            return newHead;
        }

        public static ListNode reverseList1(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode newHead = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        ListNode listNode = reverseList2(head);
        System.out.println(listNode);
        System.out.println(listNode.next);
        System.out.println(listNode.next.next);
    }

    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prv=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode nxt = cur.next;
            cur.next=prv;
            prv=cur;
            cur=nxt;
        }
        return prv;
    }
}
