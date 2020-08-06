package com.example.algorithm.datastructuresalgorithms.algor.leetcode.list;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/3/1 下午3:40
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example:
 *
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 *
 * 查找并删除（1、声明头节点
 *           2、双指针）
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        //初始节点
        ListNode sentinel = new ListNode(0);
        //加入链表
        sentinel.next=head;
        //声明双指针
        ListNode prev = sentinel, curr = head;
        while (curr!=null){
            if (curr.val==val){
                //remove操作
                prev.next=curr.next;
            }else {
                //前指针更新
                prev=curr;
            }
            //后指针更新
            curr=curr.next;
        }
        //head=初始节点的next域
        return sentinel.next;
    }
}
