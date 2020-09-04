package com.example.algorithm.designPatterns.chainOfResonsibility;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/4 下午12:33
 */
public class SensitiveFitter implements Fitter {

    @Override
    public void doFitter(Msg msg) {
        String replace = msg.getMsg().replace("996", "955");
        msg.setMsg(replace);
    }
}
