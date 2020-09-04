/**
 * @Author: apple
 * @Description:
 *      责任链模式：
 *      当一条数据想要通过不同的规则进行清洗的时候的可以使用
 *      interface： 将不同规则抽象出来作为接口，将变化的抽象
 *      规则类Fitter：实现接口
 *      FitterChain：责任链条  聚合list<fitter> 将规则类add进去  使用doFitter方法进行链式过滤数据
 *      可以实现fitter接口  方便两条责任链add
 * @Date: 2020/9/4 下午1:37
 */
package com.example.algorithm.designPatterns.chainOfResonsibility;