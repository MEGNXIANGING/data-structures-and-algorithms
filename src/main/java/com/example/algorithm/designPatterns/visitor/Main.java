package com.example.algorithm.designPatterns.visitor;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/9 上午12:13
 */
public class Main {
    public static void main(String[] args) {
        PeopleVisitor peopleVisitor = new PeopleVisitor();
        peopleVisitor.VisitCpu(new CPU());
    }
}
