package com.example.algorithm.designPatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午7:55
 */
public class Main {
    public static void main(String[] args) {
//        new LogProxy(new TimeProxy(new TankMovable())).move();

        //jdk动态代理 (.class都是字节码) 类会加载到内存中，通过二进制字节码分析类的属性与方法
//        TankMovable tank = new TankMovable();
        //创建代理对象  参数
        //              1 对象点classloader加载到内存的对象，与被代理对象使用同一个
        //              2 被代理对象实现的接口 interface类 这里tank实现了movable接口
        //              3 调用处理器  函数式接口
        //      调用处理器参数
        //
//        Movable m = (Movable) Proxy.newProxyInstance(tank.getClass().getClassLoader(), new Class[]{Movable.class},
//                (proxy, method, ar) -> {
//                    System.out.println("method" + method.getName() + "   start");
//                    //
//                    Object invoke = method.invoke(tank, ar);
//                    System.out.println("method" + method.getName() + "   end");
//                    return invoke;
//                });
//        m.move();

        Movable m = (Movable) Proxy.newProxyInstance(TankMovable.class.getClassLoader(), new Class[]{Movable.class},
                new myHandler());
        m.move();
    }
}

/**
 * jdk动态代理  实现invocationHandler
 * 通过invoke方法
 */
class myHandler implements InvocationHandler{
    TankMovable tank;

    public myHandler() {
        this.tank = new TankMovable();
    }

    /**
     *
     * @param proxy 生成的代理类的对象 this
     * @param method  接口实现的方法
     * @param objects 方法想要的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {
        System.out.println("method 被调用啦"+method.getName());
        //tank.move()
        method.invoke(tank,objects);
        System.out.println("method 调用结束"+method.getName());
        return null;
    }
}