package com.example.algorithm.designPatterns.composite;

import com.example.algorithm.datastructuresalgorithms.xiaomage.list.List;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午5:34
 */
public class BranchNode extends Node {
    private String branch;
    private List<Node> nodeList;

    public BranchNode(String branch) {
        this.branch = branch;
    }
    public void  add(Node node){
        nodeList.add(node);
    }

    @Override
    public void p() {
        System.out.println("this is branch"+branch);
    }
}
