package com.example.algorithm.designPatterns.Adapter;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/19 下午10:08
 */
public class Adapter2 implements NetToUsb {
    private Network network;

    public Adapter2(Network network) {
        this.network = network;
    }

    @Override
    public void handleRequest() {
        network.request();
    }
}
