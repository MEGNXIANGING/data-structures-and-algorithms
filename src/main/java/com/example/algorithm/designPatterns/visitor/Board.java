package com.example.algorithm.designPatterns.visitor;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/9 上午12:03
 */
public class Board implements ComputerPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.VisitBoard(this);
    }

    @Override
    public double getPrice() {
        return 200;
    }
}
