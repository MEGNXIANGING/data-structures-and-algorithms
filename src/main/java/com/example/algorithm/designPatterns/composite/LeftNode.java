package com.example.algorithm.designPatterns.composite;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午5:32
 */
public class LeftNode extends Node {
    private String content;

    public LeftNode(String content) {
        this.content = content;
    }

    @Override
    public void p() {
        System.out.println("this is leftNode"+content);
    }
}
