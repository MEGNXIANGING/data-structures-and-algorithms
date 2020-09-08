package com.example.algorithm.designPatterns.visitor;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午11:55
 */
public interface Visitor {
    void VisitCpu(CPU cpu);

    void VisitMemory(Memory memory);

    void VisitBoard(Board board);
}
