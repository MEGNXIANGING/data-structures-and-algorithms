package com.example.algorithm.designPatterns.chainOfResponsibility;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/4 下午12:32
 */
public class HTMLFitter implements Fitter {
    @Override
    public void doFitter(Msg msg) {
        String replace = msg.getMsg().replace("<", "[");
        msg.setMsg(replace);
        String replace1 = msg.getMsg().replace(">", "]");
        msg.setMsg(replace1);
    }
}
