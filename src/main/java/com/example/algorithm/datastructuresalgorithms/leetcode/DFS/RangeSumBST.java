package com.example.algorithm.datastructuresalgorithms.leetcode.DFS;




import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> list = new ArrayList<>();
        trav(root, list);
        int sum = 0;
        for (Integer itm : list) {
            if (itm >= low && itm <= high) {
                sum += itm;
            }
        }
        return sum;
    }

    /**
     * 暴力
     * @param root
     * @param list
     */
    private void trav(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left != null) {
            trav(root.left, list);
        }
        if (root.right != null) {
            trav(root.right, list);
        }
    }

    /**
     * 递归
     * @param root
     * @param low
     * @param high
     * @return
     */
    public int rangeSumBST2(TreeNode root, int low, int high) {
        if (root==null){
            return 0;
        }
        int leftSum = rangeSumBST2(root.left, low, high);
        int rightSum = rangeSumBST2(root.right, low, high);
        int result=leftSum+rightSum;
        if (low<=root.val&&root.val<=high){
            result+=root.val;
        }
        return result;
    }

    public int rangeSumBST3(TreeNode root, int low, int high) {
        if (root==null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);
        int result=0;
        while (queue.size()!=0){
            TreeNode temp = queue.poll();
            if (temp.val>=low&&temp.val<=high){
                result+=temp.val;
            }
            if (temp.left!=null){
                queue.add(temp.left);
            }
            if (temp.right!=null){
                queue.add(temp.right);
            }
        }
        return result;
    }
}

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }