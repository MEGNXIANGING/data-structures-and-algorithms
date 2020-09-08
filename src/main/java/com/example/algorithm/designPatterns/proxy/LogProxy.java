package com.example.algorithm.designPatterns.proxy;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午7:56
 */
public class LogProxy implements Movable {
    private Movable movable;

    public LogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("log print");
        movable.move();
    }
}
