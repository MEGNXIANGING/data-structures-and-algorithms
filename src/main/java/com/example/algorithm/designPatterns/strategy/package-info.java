/**
 * @Author: apple
 * @Description:  策略模式
 *  解决多种算法策略存在 if else复杂的问题
 * 1、 声明比较器 Comparor
 * 2、 在排序的时候传入比较器
 * 3、 不同的排序规则类实现比较器
 * 4、 客户端测试的时候new 比较器的实现，来实现不同动物，不同规则比较大小
 *
 * @Date: 2020/9/3 下午2:39K
 */
package com.example.algorithm.designPatterns.strategy;