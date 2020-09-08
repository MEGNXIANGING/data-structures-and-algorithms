package com.example.algorithm.designPatterns.singe;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/1 下午5:38
 */
public enum  EnumSinge {
    INSTANCE;

    EnumSinge() {
    }

    public   static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(EnumSinge.INSTANCE.hashCode());
            }).start();
        }
    }
}
