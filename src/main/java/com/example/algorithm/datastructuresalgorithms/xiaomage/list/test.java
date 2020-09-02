package com.example.algorithm.datastructuresalgorithms.xiaomage.list;

import com.example.algorithm.datastructuresalgorithms.xiaomage.list.Linked.SingleLinkedList;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/8/29 下午11:27
 */
public class test {
    public static void main(String[] args) {
        List ar = new SingleLinkedList();
        ar.add("a");
        ar.add(88);
        ar.add("b");
        ar.add(66);
        ar.add(2,87);
        System.out.println(ar);
        System.out.println(16<<1);
    }

    /**
     * 反转链表⌚
     * @param head
     * @return
     */
    private ListNode test1(ListNode head){
        if (head==null || head.next==null){
            return head;
        }
        ListNode newHead=test1(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
