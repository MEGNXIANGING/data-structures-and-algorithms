package com.example.algorithm.designPatterns.chainOfResponsibility;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/4 下午1:11
 */
public class WorldFitter  implements Fitter{
    @Override
    public void doFitter(Msg msg) {
        String replace = msg.getMsg().replace("hhh", "dudu");
        msg.setMsg(replace);
    }
}
