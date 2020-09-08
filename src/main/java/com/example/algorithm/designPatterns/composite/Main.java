package com.example.algorithm.designPatterns.composite;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午5:31
 */
public class Main {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode branch1 = new BranchNode("branch1");
        BranchNode branch2 = new BranchNode("branch2");
        root.add(branch1);
        root.add(branch2);
        LeftNode ada = new LeftNode("ada");
        LeftNode dcf = new LeftNode("dcf");
        branch1.add(ada);
        branch2.add(dcf);
    }
}
