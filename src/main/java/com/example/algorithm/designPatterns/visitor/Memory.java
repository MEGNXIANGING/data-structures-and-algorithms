package com.example.algorithm.designPatterns.visitor;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/9 上午12:01
 */
public class Memory implements ComputerPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.VisitMemory(this);
    }

    @Override
    public double getPrice() {
        return 300;
    }
}
