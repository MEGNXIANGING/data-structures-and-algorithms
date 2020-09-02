package com.example.algorithm.designPatterns.singe;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/1 下午5:05
 */
public class StaticClass {
    private StaticClass() {
    }
    private static class StaticClass01{
        private static final StaticClass  INSTANCE=new StaticClass();
    }
    public StaticClass getInstance(){
        return StaticClass01.INSTANCE;
    }
}
