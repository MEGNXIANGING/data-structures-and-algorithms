package com.example.algorithm.datastructuresalgorithms.algor.leetcode.list;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/3/1 下午3:13
 * Given a linked list, determine if it has a cycle in it.
 *
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 *https://leetcode-cn.com/problems/linked-list-cycle/
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head==null||head.next==null) return false;
        ListNode slow=head;
        ListNode fist=head.next;
        while (fist !=null){
            if (slow==fist){
                return true;
            }
            slow=slow.next;
            fist=fist.next.next;
        }
        return false;
    }
}
