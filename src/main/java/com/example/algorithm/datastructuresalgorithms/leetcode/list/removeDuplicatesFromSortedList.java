package com.example.algorithm.datastructuresalgorithms.leetcode.list;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/3/1 下午4:07
 */
public class removeDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while (temp!=null||temp.next!=null){
            if (temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else {
                temp=temp.next;
            }
        }
        return head;
    }
}
