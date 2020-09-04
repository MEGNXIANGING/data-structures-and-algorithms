package com.example.algorithm.designPatterns.chainOfResonsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/4 下午12:56
 */
public class FitterChain implements Fitter {
    private List<Fitter> fitterList = new ArrayList();
    //聚合责任链
    public FitterChain add(Fitter... fitter) {
        Fitter[] fitters = fitter;
        for (Fitter f : fitters) {
            fitterList.add(f);
        }
        return this;
    }


    public void doFitter(Msg msg) {
        fitterList.forEach(fitter -> {
            fitter.doFitter(msg);
        });
    }
}
