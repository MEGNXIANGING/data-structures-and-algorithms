package com.example.algorithm.designPatterns.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午9:27
 */
public class Cglib {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TankMovable.class);
        enhancer.setCallback(new myCglibInterceptor());
        TankMovable tank = (TankMovable) enhancer.create();
        tank.move();
    }

}

class myCglibInterceptor implements MethodInterceptor{

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        methodProxy.invokeSuper(o,objects);
        System.out.println("after");
        return null;
    }
}