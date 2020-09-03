package com.example.algorithm.designPatterns.AbstractFactory;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 下午3:36
 */
public class Broom implements Vehicle {
    @Override
    public void go() {
        System.out.println("骑魔法扫把咯");
    }
}
