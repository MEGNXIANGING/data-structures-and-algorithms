package com.example.algorithm.designPatterns.strategy.mode1;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 下午9:51
 */
public class StrategyAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
