package com.example.algorithm.datastructuresalgorithms.leetcode.list;

/**
 * @Author: apple
 * @Description: 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * @Date: 2020/9/29 下午11:04
 */
public class AddList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dump = new ListNode(0);
        ListNode pre = dump;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pre.next = l1;
                pre = pre.next;
                l1 = l1.next;
            } else {
                pre.next = l2;
                pre = pre.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            pre.next = l1;
        }
        if (l2 != null) {
            pre.next = l2;
        }

        return dump.next;
    }
}
