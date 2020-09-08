package com.example.algorithm.designPatterns.visitor;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午11:58
 */
public class CPU  implements ComputerPart{
    @Override
    public void accept(Visitor visitor) {
        visitor.VisitCpu(this);
    }

    @Override
    public double getPrice() {
        return 500;
    }
}
