/**
 * @Author: apple
 * @Description:
 *  抽象工厂模式：
 *      AbstractFactory：抽象工厂，定义所有的产品族应该返回的对象
 *      AbstractXXXFactory：具体工厂，返回该工厂具体产品族想要的对象
 *      interface：定义不同的产品族
 *      子类：实现该产品组接口
 *      客户端：调用具体工厂使用多态生成想要的对象信息
 *
 * @Date: 2020/9/3 下午5:31
 */
package com.example.algorithm.designPatterns.AbstractFactory;