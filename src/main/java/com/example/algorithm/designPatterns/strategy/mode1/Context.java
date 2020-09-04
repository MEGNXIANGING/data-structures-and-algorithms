package com.example.algorithm.designPatterns.strategy.mode1;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 下午9:54
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2){
       return strategy.doOperation(num1,num2);
    }
}
