package com.example.algorithm.designPatterns.proxy;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午7:53
 */
public class TankMovable implements Movable {
    @Override
    public void move() {
        System.out.println("tank move ing......");
    }
}
