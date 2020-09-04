package com.example.algorithm.designPatterns.strategy.mode1;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 下午9:55
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new StrategyAdd());
        System.out.println(context.executeStrategy(5,10));
    }
}
