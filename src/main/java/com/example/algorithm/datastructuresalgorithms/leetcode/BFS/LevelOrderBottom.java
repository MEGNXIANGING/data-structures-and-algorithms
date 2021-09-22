package com.example.algorithm.datastructuresalgorithms.leetcode.BFS;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);
        Stack<List<Integer>> stack = new Stack<>();
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> ls = new ArrayList<>();
            while (size!=0){
                TreeNode temp = queue.poll();
                size--;
                ls.add(temp.val);
                if (temp.left!=null){
                    queue.add(temp.left);
                }
                if (temp.right!=null){
                    queue.add(temp.right);
                }
            }
            stack.add(ls);
        }
        while (!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }

    public List<List<Integer>> levelOrderBottom2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        dfs(root,result,0);
        Collections.reverse(result);
        return result;
    }

    private void dfs(TreeNode node, List<List<Integer>> result, int level) {
        if (node==null){
            return;
        }
        if (level<result.size()-1){
            result.add(new ArrayList<>());
        }
        result.get(level).add(node.val);
        if (node.left!=null){
            dfs(node.left,result,level++);
        }
        if (node.right!=null){
            dfs(node.right,result,level++);
        }
    }
}
