package com.example.algorithm.designPatterns.singleFactory;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 下午3:06
 */
public class Car implements MoveAble{
    @Override
    public void go() {
        System.out.println("car run dudu");
    }
}
