package com.example.algorithm.designPatterns.visitor;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午11:58
 */
public interface ComputerPart {
    void accept(Visitor visitor);

    double getPrice();
}
