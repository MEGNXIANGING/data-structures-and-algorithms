package com.example.algorithm.designPatterns.Adapter;

/**
 * @Author: apple
 * @Description:
 *  usb   网线  电脑
 * @Date: 2020/9/19 下午10:02
 */
public class Adapter extends Network implements NetToUsb {


    @Override
    public void handleRequest() {
        super.request();
    }
}
