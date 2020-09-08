package com.example.algorithm.designPatterns.Observer;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午3:50
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.setEvent(new WakeUpEvent(11,"a"));
        child.wakeUp();
    }
}
