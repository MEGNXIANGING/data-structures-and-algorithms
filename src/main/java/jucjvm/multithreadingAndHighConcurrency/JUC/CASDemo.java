package jucjvm.multithreadingAndHighConcurrency.JUC;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: apple
 * @Description: 比较并交换
 * @Date: 2020/9/10 上午10:37
 */
public class CASDemo {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);

        System.out.println(atomicInteger.compareAndSet(5,2015)+" data"+atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(5,2019)+" data"+atomicInteger.get());

    }

}
