package com.example.algorithm.designPatterns.builder;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/9 下午12:13
 */
public class Main {
    public static void main(String[] args) {
        Person builder = new HeadBuilder().setHeight().setLong().setWeight().builder();
    }
}
