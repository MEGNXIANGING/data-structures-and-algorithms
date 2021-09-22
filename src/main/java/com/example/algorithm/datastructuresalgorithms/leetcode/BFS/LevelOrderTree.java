package com.example.algorithm.datastructuresalgorithms.leetcode.BFS;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class LevelOrderTree {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root==null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);
        while (queue.size()!=0){
            int size = queue.size();
            List<Integer> ls = new ArrayList<>();
            while (size!=0){
                TreeNode temp = queue.poll();
                ls.add(temp.val);
                size--;
                if (temp.left!=null){
                    queue.add(temp.left);
                }
                if (temp.right!=null){
                    queue.add(temp.right);
                }
            }
            list.add(ls);
        }
        return list;
    }


    public List<List<Integer>> levelOrde2(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root==null){
            return list;
        }
        dfs(root,list,0);
        return list;
    }

    private void dfs(TreeNode node, List<List<Integer>> result, int level) {
        if (node==null){
            return;
        }
        //初始化小数组
        if (level>result.size()-1){
            result.add(new ArrayList<>());
        }
        result.get(level).add(node.val);
        if (node.left!=null){
            dfs(node.left,result,level+1);
        }
        if (node.right!=null){
            dfs(node.right,result,level+1);
        }
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
