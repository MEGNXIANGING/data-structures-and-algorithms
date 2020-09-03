package com.example.algorithm.designPatterns.singleFactory;

/**
 * @Author: apple
 * @Description:
 *      简单工厂的拓展性不好
 * @Date: 2020/9/3 下午3:06
 */
public class SingleVehicleFactory {
    public Car getCar(){
        return new Car();
    }

    public Plane getPlane(){
        return new Plane();
    }
}
