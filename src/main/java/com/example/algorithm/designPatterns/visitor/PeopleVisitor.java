package com.example.algorithm.designPatterns.visitor;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/9 上午12:06
 */
public class PeopleVisitor implements Visitor{
    double price=9.9;
    @Override
    public void VisitCpu(CPU cpu) {
        price+=cpu.getPrice()*0.4;
    }

    @Override
    public void VisitMemory(Memory memory) {
        price+=memory.getPrice()*0.5;
    }

    @Override
    public void VisitBoard(Board board) {
        price+=board.getPrice()*0.6;
    }
}
