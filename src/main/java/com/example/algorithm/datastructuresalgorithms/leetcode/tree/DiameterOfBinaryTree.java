package com.example.algorithm.datastructuresalgorithms.leetcode.tree;

public class DiameterOfBinaryTree {
    /**
     * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
     *
     * @param root
     * @return
     */
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return res;
        }
        getRes(root);
        return res;

    }


    public int getRes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getRes(root.left);
        int rightHeight = getRes(root.right);
        res=Math.max(leftHeight+rightHeight,res);
        return Math.max(leftHeight,rightHeight)+1;

    }

}
