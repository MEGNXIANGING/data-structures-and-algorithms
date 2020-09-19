package com.example.algorithm.designPatterns.Adapter;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/19 下午10:00
 */
public class Computer {
    public void net(NetToUsb adapter){
        //上网的具体实现
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Network network = new Network();
        Adapter adapter = new Adapter();

        computer.net(adapter);
    }
}
