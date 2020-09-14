package jucjvm.multithreadingAndHighConcurrency.JUC;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/13 下午10:07
 */
public class ParkDemo {
    private static AtomicInteger anInt =new AtomicInteger();
    private ReentrantLock lock=new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

    }
}
