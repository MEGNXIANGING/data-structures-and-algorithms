package com.example.algorithm.designPatterns.proxy;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午7:54
 */
public class TimeProxy implements Movable {
    private Movable movable;

    public TimeProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("时间");
        movable.move();
        System.out.println("end");
    }
}
