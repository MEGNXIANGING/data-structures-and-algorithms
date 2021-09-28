package com.example.algorithm.datastructuresalgorithms.leetcode.list;

import com.example.algorithm.datastructuresalgorithms.algor.List;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode node = reList2(head);
        while (slow != null) {
            if (head.val != slow.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur.next != null) {
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }

    public ListNode reList2(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode newHead = reList2(head);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
