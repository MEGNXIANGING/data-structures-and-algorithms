package com.example.algorithm.designPatterns.builder;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/9 上午11:57
 */
public interface Builder {
    Builder setWeight();

    Builder setHeight();

    Builder setLong();

    Person builder();
}
