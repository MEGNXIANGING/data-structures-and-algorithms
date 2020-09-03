package com.example.algorithm.designPatterns.singleFactory;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 下午2:59
 */
public class TestFactory {
    public static void main(String[] args) {
        SingleVehicleFactory factory = new SingleVehicleFactory();
        Car car = factory.getCar();
        car.go();
    }
}
