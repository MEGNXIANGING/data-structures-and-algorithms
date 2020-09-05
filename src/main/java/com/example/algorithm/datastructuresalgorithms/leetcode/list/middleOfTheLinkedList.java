package com.example.algorithm.datastructuresalgorithms.leetcode.list;


/**
 * @Author: apple
 * @Description:
 * @Date: 2020/3/1 下午8:50
 */
public class middleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode fast=head,slow=head;
        while (fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
